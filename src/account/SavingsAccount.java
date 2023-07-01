package account;

@SuppressWarnings("ALL")
public class SavingsAccount extends Account {
    private double rate;

     public SavingsAccount (){ // construtor padrão da subclasse que sempre chama o super para o nível acima
         //é opcional escrever o super quando não há parametros, porém, se escrito deve ser antes de qualquer outra instrução
         //System.out.println(); Se descomentar essa linha cairá no erro Call to 'super()' must be first statement in constructor body

        super();
    }

    public SavingsAccount(String number){
        super(number); // novo construtor da superclasse e passando um parametro fixo 1234 para a subclasse
        rate = 1;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance * rate;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Rate: " + rate);

    }
}
