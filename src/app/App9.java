package app;

import pet2.Dog;
//import pet2.Fish;
import pet2.Pet;

@SuppressWarnings("ALL")
public class App9 {

    public static void main(String[] args) {

        Pet p = new Dog(); // Pet não acessa o método exclusivo de dog para isso é necessário casting explícito
        p.feed(); // Pet só enxerga o feed;

        //Fish f = (Fish) p; // descomentar esse código dará erro na execução por causa do casting explícito incorreto
        //f.feed(); // Fish não está na mesma hierarquia de Dog usada na variável p

        if (p instanceof Dog) { // instanceof deixa o casting explícito mais seguro pois verifica se o objeto...
            Dog d = (Dog) p; // ... da variável que se quer fazer o casting explícito é do mesmo tipo do Heap
            d.sit(); // se for não haverá erro em tempo de execução e o método será executado como esperado
        } else { // com a verificação usando o instanceof se não for do mesmo tipo pode avisar após a checagem do if
            System.out.println("O tipo não é um Dog"); // assim o else é chamado e evita erro no programa em tempo de execução
        }
    }
}
