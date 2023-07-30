public class Debt {

    private double balance;
    private double interest;

    public Debt(double iBalance, double iInterest) {
        this.interest = iInterest;
        this.balance = iBalance;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }
    
    public void waitOneYear() {
        this.balance *= this.interest;
    }
}
