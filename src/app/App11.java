package app;

import record.Person;
import record.PersonRecord;

public class App11 {

    public static void main(String[] args) {

        Person person = new Person("José","Silva", 30);
        System.out.println(person);

        PersonRecord personRecord = new PersonRecord("José", "Silva", 30); // construtor automático
        System.out.println(personRecord); // toString já implementado
        System.out.println(personRecord.firstName()); // exemplo de getter do record não precisa digitar o get

        PersonRecord personRecord2 = new PersonRecord("José", "Silva", 30);
        System.out.println(personRecord2.equals(personRecord)); // equals já implementado comparando o 2 com o 1
        // Num record o Java considera os dados para verificar se os objetos são iguais, se mudar a idade por exemplo
        // o resultado será outro (false, pois não serão mais iguais)

    }
}
