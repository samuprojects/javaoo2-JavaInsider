package app;

import account.Account;

public class App3 {

    public static void main(String[] args) {

        // Todas as classes herdam de Object e não precisamos escrever isso (com extends por exemplo)
        // assim como não precisamos chamar o super porque Object é construído de forma automática
        // Pode usar no intellij CTRL + clique do mouse para acessar as informações de cada elemento do código
        // Como Object possui vários métodos eles também estão disponíveis a todas classes da aplicação
        // como é o caso do toString() que pega o nome da classe concatena com hasCode e converte para uma String hexadecimal
        // que é como ele apresenta a referencia de memória quando chamado o que não é interessante em apresentar dados do objeto
        // todos esses métodos de Object também podem ser sobrescritos e com isso podemos por exemplo
        // retornar num println a impressão de um objeto, poque internamente já traz o valueOf do Objeto pelo toString
        // ou seja, não é preciso grafar o toString dentro do System.out.println porque o método println já traz o toString

        Account a = new Account();
        a.setOwner("Carlos");
        a.setNumber("123");
        a.setBalance(1000);
        //System.out.println(a.toString());
        // Podemos usar no intellij o ALT + Insert para criar o toString na forma dos seus atributos de forma automática
        // Conforme foi definido em Account
        System.out.println(a);



    }
}
