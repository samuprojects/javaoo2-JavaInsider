package string;

public interface StringManipulator {

    // A implementação de interfaces é como um "contrato" em que as classes se comprometem a implementar seus métodos
    // Quando um novo método é incluído na interface "esse contrato" é quebrado e todas as classes que o implementam
    // deixam de funcionar.
    // Historicamente o problema surgiu quando tentaram criar novas funcionalidades, entre outros, na interface List, que é
    // muito utilizada, tanto pela própia API do Java, como em outros códigos dependentes.
    // Por isso a equipe Java a partir da versão 8 passou a permitir a adição de novos métodos sem a quebra do "contrato"
    // utilizando o modificador default, com isso fica livre para implementar métodos na interface e a classe não quebra.

    String join(String s1, String s2);

    String takeFirst(String s, int length);

    default String upper (String s){
        return s.toUpperCase();
    }
}
