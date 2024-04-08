package BankFramework;
public class MMBankFactory extends BankFactory {
    // Factory method to create a new MMSavingAcc instance
    @Override
    public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        return new MMSavingAcc(accNo, accNm, accBal, isSalaried);
    }

    // Factory method to create a new MMCurrentAcc instance
    @Override
    public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        return new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
    }

    // Entry point for the application
    public static void main(String[] args) {
        // Assign instance of MMBankFactory to BankFactory reference
        BankFactory bankFactory = new MMBankFactory();

        // Instantiate MMSavingAcc and refer it through reference SavingAcc
        SavingAcc savingAcc = bankFactory.getNewSavingAcc(123456, "Shrinivas Kulkarni", 5000, true);

        // Instantiate MMCurrentAcc and refer it through reference CurrentAcc
        CurrentAcc currentAcc = bankFactory.getNewCurrentAcc(654321, "Samarth S D", 10000, 20000);

        // Invoke withdraw() method
        savingAcc.withdraw(2000);
        currentAcc.withdraw(15000);

        // Invoke toString() method
        System.out.println("Saving Account Details:");
        System.out.println(savingAcc.toString());
        System.out.println("\nCurrent Account Details:");
        System.out.println(currentAcc.toString());
    }
}

