public class CurrentAccount extends Account{
    private int numberOfTransactions;
    private double moneyToPay;

    public CurrentAccount(String nameOfTheClient, int accountNumber, double balance, double interestRate, int numberOfTransactions, double moneyToPay) {
        super(nameOfTheClient, accountNumber, balance, interestRate);
        this.numberOfTransactions = numberOfTransactions;
        this.moneyToPay = moneyToPay;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public double getMoneyToPay() {
        return moneyToPay;
    }

    public void setMoneyToPay(double moneyToPay) {
        this.moneyToPay = moneyToPay;
    }
    public void transactionsReceipt(){

    }

}
