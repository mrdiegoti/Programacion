public class SavingAccount extends Account{
    private int maintenanceFee;

    public SavingAccount(String nameOfTheClient, int accountNumber, double balance, double interestRate) {
        super(nameOfTheClient, accountNumber, balance, interestRate);
        this.maintenanceFee = 15;
    }

    public double getMaintenanceFee() {
        return maintenanceFee;
    }

    public void setMaintenanceFee(int maintenanceFee) {
        this.maintenanceFee = maintenanceFee;
    }
    public double calculateInterests(){
        return getBalance() * getInterestRate();
    }
    public double getFinalBalance(){

    }
}
