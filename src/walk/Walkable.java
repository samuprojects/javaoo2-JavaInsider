package walk;

@SuppressWarnings("ALL")
public interface Walkable {

    // As classes que implementarem a interface deverão também implementar os métodos definidos aqui
    // Antes do Java 8 as interfaces possuíam apenas assinatura de métodos
    // A partir do Java 8 existem formas de escrever métodos que serão abordados posteriormente
    // A classe que implementa a interface segue o conceito de herança e por isso Ant e Person são Walkable

    void walk();
    void stop();
}
