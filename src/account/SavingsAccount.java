package account;

@SuppressWarnings("ALL")
public class SavingsAccount extends Account {
    private double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void setBalance(double balance) { // sobrescrita de setBalance da superclasse na subclasse
        this.balance = balance * rate; // com isso ao retornar o saldo vai aplicar a taxa de rendimento da pupoança
    }
}
