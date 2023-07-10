package app;

import pet2.Dog;
import pet2.Pet;

@SuppressWarnings("ALL")
public class App10 {

    public static void main(String[] args) {

        // A partir do Java 16 temos uma forma melhor de usar o instanceof chamada Pattern Matching for instanceof
        Pet p = new Dog();

        if (p instanceof Dog d) { // com essa simplificação já cria o objeto se for objeto do mesmo tipo
            d.sit();
        }
    }
}
