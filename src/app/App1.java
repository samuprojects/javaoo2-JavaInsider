package app;

import account.Account;
import account.SavingsAccount;

public class App1 {

    public static void main(String[] args) {

        Account a1 = new Account();
        a1.setNumber("1234");
        a1.setOwner("Pedro");
        a1.setBalance(1000);
        // a1.setRate(1.2); não funciona pois não existe em account2.Account
        a1.print();

        SavingsAccount a2 = new SavingsAccount();
        a2.setNumber("4321");
        a2.setOwner("João");
        a2.setRate(1.2); // funciona pois herdou de account2.SavingsAccount (taxa Juros Poupança)
        a2.setBalance(500);
        a2.print();
    }
}
