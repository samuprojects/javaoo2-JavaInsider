package string;

public interface CharacterChanger {

    // Criado o problema do Diamond por causa da ambiguidade com o método da outra interface
    default String upper(String s) { // para resolver basta sobrescrever o método conforme realizado na outra interface
        return "*" + s.substring(1);
    }
}
