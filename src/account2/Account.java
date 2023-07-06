package account2;

@SuppressWarnings("ALL")
public abstract class Account {

    private double balance;

    Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance() {
        balance += balance * rate();
    }

    abstract double rate();
}
