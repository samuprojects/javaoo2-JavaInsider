package string;

public class StringManipulatorImpl implements StringManipulator, CharacterChanger {

    @Override
    public String join(String s1, String s2) {
        return s1 + s2;
    }

    @Override
    public String takeFirst(String s, int length) {
        return s.substring(0, length);
    }

    // a solução para o Diamond Problem (por causa da ambiguidade com o método da interface CharacterChanger)
    @Override
    public String upper(String s) { // é sobrescrever o método informando OU colocando uma outra implementação qualquer
        return CharacterChanger.super.upper(s); // OU passar qual deseja chamar nesse caso com o nome da interface
        // seguido do super e chamando o método desejado passando o parametro.
        // com isso ambiguidade resolvida o Diamond Problem acaba
    }
}
