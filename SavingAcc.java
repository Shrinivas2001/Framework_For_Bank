package BankFramework;
public abstract class SavingAcc extends BankAcc {
  
    private boolean isSalaried;
    private static final float MINBAL = 1000; // Minimum balance

    // Constructor
    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    // Getter for isSalaried (Read Only)
    public boolean isSalaried() {
        return isSalaried;
    }

    // Withdraw money from the account
    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL && amount > 0) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed: Insufficient balance or below minimum balance.");
        }
    }

    // String representation of the account details
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Is Salaried: " + isSalaried;
    }
}
