package app;

import generator.Generator;
import generator.Person;
//import generator.RandomGenerator;
import generator.SequenceGenerator;

public class App8 {

    public static void main(String[] args) {

        //Generator generator = new RandomGenerator(); // objeto da subclasse é do tipo da Superclasse, aqui aleatório
        Generator generator = new SequenceGenerator(); // mudou apenas o objeto já mudou a forma de IDs, aqui sequencial

        Person p1 = new Person(generator);
        System.out.println(p1.getId());

        Person p2 = new Person(generator);
        System.out.println(p2.getId());

        Person p3 = new Person(generator);
        System.out.println(p3.getId());

    }
}
