package BankFramework;
public abstract class BankAcc {
    // Fields
    private int accNo;
    private String accNm;
    private float accBal;

    // Constructor
    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    // Getters for read-only fields
    public int getAccNo() {
        return accNo;
    }

    public float getAccBal() {
        return accBal;
    }

    // Setter for read-write field
    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    // Withdraw money from the account
    public void withdraw(float amount) {
        if (amount > 0 && amount <= accBal) {
            accBal -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal failed: Insufficient balance or invalid amount.");
        }
    }

    // Deposit money into the account
    public void deposit(float amount) {
        if (amount > 0) {
            accBal += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit failed: Invalid amount.");
        }
    }

    // String representation of the account details
    @Override
    public String toString() {
        return "Account Number: " + accNo + "\n" +
               "Account Name: " + accNm + "\n" +
               "Account Balance: " + accBal;
    }
}
