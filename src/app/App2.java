package app;

import account.SavingsAccount;

public class App2 {

    public static void main(String[] args) {

        // Sobre construtores por "detrás dos panos" ao instanciar SavingAccount o Java chama o construtor da subclasse
        // o construtor da subclasse invoca o construtor de Account que após inicializado
        // termina de construir o objeto com o construtor da subclasse
        // se a hierarquia for maior os construtores vão sendo chamados e os objetos criados de cima para baixo
        SavingsAccount a1 = new SavingsAccount("2222");
        System.out.println(a1.getNumber());

    }
}
