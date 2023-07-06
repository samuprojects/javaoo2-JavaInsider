package account2;

public class ExAccount {

    public static void main(String[] args) {

        CheckingAccount a1 = new CheckingAccount(0.01); // passamos o rate da subclasse
        System.out.println(a1.getBalance());
        a1.updateBalance(); // aplicamos o método da superclasse que identifica que é o rate da subclasse CheckingAccount
        a1.updateBalance();
        System.out.println(a1.getBalance());

        System.out.println("--------------------------");

        SavingsAccount a2 = new SavingsAccount(100); // passamos o balance mais alto para ver o calculo do rate
        System.out.println(a2.getBalance());
        a2.updateBalance(); // aplicamos o método da superclasse que identifica o uso do rate da subclasse SavingsAccount
        a2.updateBalance();
        System.out.println(a2.getBalance());
    }
}
