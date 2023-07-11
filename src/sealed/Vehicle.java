package sealed;

@SuppressWarnings("ALL")
public abstract sealed class Vehicle permits Car, Bus {
// Introduzido no Java 17 as Sealed Class que limitam a herança no Java e evitar como nessa codificação uma classe
// cadeira estender uma superclasse de veículos, não tem lógica.
// Ao identificar uma classe ou interface como Sealed tem que passar quais subclasses vão compor a herança dessa superclasse
// para isso incluir a palavra permits seguido das subclasses permitidas para herdar de Vehicle

    public abstract void drive();
}
