package BankFramework;

public class MMCurrentAcc extends CurrentAcc {
    // Constructors
    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }

    // Method to withdraw money from the account
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
        return super.toString();
    }
}
