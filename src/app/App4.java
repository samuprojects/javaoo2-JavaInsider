package app;

import walk.Person;
@SuppressWarnings("ALL")
public class App4 {

    public static void main(String[] args) {

        // Aqui não estamos usando a pessoa (objeto) Person, e sim chamando o atributo direto da interface por meio da Classe
        System.out.println(Person.height);
        // outro ponto é que o atributo nas condições de public static também são final e não podem ser modificados
        // com isso tem o comportamento de uma constante do Java

        // Interfaces são abstract por isso não podem ser instanciadas.
        // Porém podemos instanciar de uma classe que implementa uma interface.
        Person p = new Person();
    }
}
