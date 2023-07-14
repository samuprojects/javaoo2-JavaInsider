package record;

import java.util.Objects;

public record PersonRecord (String firstName, String lastName, int age){

    // dentro de um record podemos criar atributos estáticos (ou seja, que não tem a ver com a instância)
    private static final int DEFAULT_AGE = 0; // pode usar o default_age no lugar do zero caso não seja informado nada


    public PersonRecord {
        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastName);
    }

        public PersonRecord(String firstName, String lastName) {
        this(firstName,lastName, DEFAULT_AGE);
        System.out.println("Person record created");
    }

    public String fullName() { // podemos criar métodos em records
        return firstName + " " + lastName;
    }

    public static PersonRecord create(String name) { // podemos criar métodos estáticos em records
        return new PersonRecord(name, ""); // aqui cria um novo objeto passando apenas o nome, o sobrenome vazio e age assume o default...

    }

}
