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

    @Override
    public void print() {
        super.print(); // o super sempre referencia o que está em um nível acima e chama o print de Account
        System.out.println("Rate: " + rate); // após mostra a linha exclusiva correspondente a poupança
        // sem alterar a aplicação principal que apenas chama o print
    }
}
