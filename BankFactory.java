package BankFramework;

public abstract class BankFactory {
    // Factory method to create a new SavingAcc instance
    public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);

    // Factory method to create a new CurrentAcc instance
    public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);
}


