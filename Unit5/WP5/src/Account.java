public abstract class Account extends{
    private String nameOfTheClient;
    private int accountNumber;
    private double balance;
    private double interestRate;

    public Account(String nameOfTheClient, int accountNumber, double balance, double interestRate) {
        this.nameOfTheClient = nameOfTheClient;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getNameOfTheClient() {
        return nameOfTheClient;
    }

    public void setNameOfTheClient(String nameOfTheClient) {
        this.nameOfTheClient = nameOfTheClient;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public abstract static class calculateInterests{

    }
    public abstract static class getFinalBalance{

    }
}
