package account;

@SuppressWarnings("ALL")
public class Account {
    private String owner;
    private String number;
    protected double balance;

     public Account(){ // esse é o construtor padrão do Java quando não é explícito na classe nenhum outro
        super();
    }

    // se apagar o constutor padrão acima e manter apenas este o construtor
    // haverá erro na subclasse pois não haverá o construtor vazio
    // a partir do momento que um construtor é definido o Java não gera mais automaticamente.
    public Account(String number){
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void print(){
        System.out.println("Owner: " + owner);
        System.out.println("Number: " + number);
        System.out.println("Balance: " + balance);


    }
}
