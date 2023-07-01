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

        // sobre herança e a questão da visibilidade (seja para atributoss, classes, métodos, construtores)
        // visibilidade private = somente elementos daquela classe podem enxergar (acessar)
        // visibilidade public = sem restrição nenhuma, pode ser acessado por qualquer código
        // visibilidade default (como é chamado mas não tem esse nome) ou package private = visível dentro do pacote
        // usado quando não escrevemos nenhuma visibilidade, todas as classes desse pacote podem ver o ememento
        // visibilidade protected = DUAS COMPORTAMENTOS, o primeiro faz a mesma coisa que o default
        // o segundo comportamento é em relação à visibilidade na Herança
        // ou seja, classes que herdam da classe onde o elemento foi definido também enxergam
        // MESMO QUE ESSA CLASSE ESTEJA EM OUTRO PACOTE
        // POR ISSO É NECESSÁRIO CAUTELA, pois outras classes em outros pacotes terão acesso a esse elemento
        // exemplo do tadeu sobre caso prático é na conexão com o banco onde informou...
        // "quem realiza de fato a conexão com o banco, é private, e há um método público chamado getConnection()"
        // "que retorna uma conexão já estabelecida para quem o invoca!"

    }
}
