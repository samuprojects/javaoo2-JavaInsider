package record;

import java.util.Objects;

public record PersonRecord (String firstName, String lastName, int age){

    public PersonRecord { // o records permite criar algumas validações para os contrutores automáticos
        // nesse caso abre um bloco de código e digita validações simples para que sejam criados objetos consistentes
        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastName);
    }

    // para criar outros construtores usando records é necessário delegar a chamada para o anterior
    // isso ocorre porque o construtor que recebe todos os parametros sempre vai existir
    // no exemplo a seguir não tem o age porém ele é chamado para satisfazer a condição de delegação do primeiro
    public PersonRecord(String firstName, String lastName) {
        this(firstName,lastName, 0);
        System.out.println("Person record created"); // na aplicação além desse novo construtor já vai criar o objeto automaticamente
    }

}
