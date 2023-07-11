package sealed;

public final class Car extends Vehicle {
    // para a superclasse voltar a funcionar as subclasses indicadas precisam ser final e não haverá herança de Car


    // toda subclasse incluída no Sealed da superclasse precisará de um modificador, podendo ser:
    // final (caso não tenha herança, sealed (com definição explícita e controlada usando permits),
    // non-sealed (se for permitir estender de Car outras classes)

    @Override
    public void drive() {
        // Drive!
    }
}
