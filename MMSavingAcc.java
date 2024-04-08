package BankFramework;

public class MMSavingAcc extends SavingAcc {

    private static final float MINBAL = 500; // Minimum balance


    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    // Method to withdraw money from the account
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
               "Minimum Balance: " + MINBAL;
    }
}
