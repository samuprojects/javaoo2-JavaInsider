package string;

public interface CharacterChanger {

    // com a implementação dos default methods agora também é possivel criar métodos utilizando private e static
    default String upper(String s) {
        return getChar() + s.substring(1);
    }

    // porém a visibilidade private só pode ser chamada dentro da interface conforme alteração a seguir
    private char getChar(){
        return '*';
    }


}
