package BankFramework;
public abstract class CurrentAcc extends BankAcc {

    private float creditLimit;
    private boolean isCreditLimitInitialized;

    // Constructor
    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
        this.isCreditLimitInitialized = true;
    }

    // Getter for creditLimit (Lazy initialization)
    public float getCreditLimit() {
        if (!isCreditLimitInitialized) {
            initializeCreditLimit();
        }
        return creditLimit;
    }

    // Lazy initialization method for creditLimit
    private void initializeCreditLimit() {
        // Perform lazy initialization here
        // Example: creditLimit = fetchCreditLimitFromDatabase();
        creditLimit = 0; // Placeholder for demonstration
        isCreditLimitInitialized = true;
    }

    // Withdraw money from the account
    @Override
    public void withdraw(float amount) {
        float totalBalance = getAccBal() + getCreditLimit();
        if (amount > 0 && amount <= totalBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed: Insufficient balance or exceeds credit limit.");
        }
    }

    // String representation of the account details
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Credit Limit: " + getCreditLimit();
    }
}
