package string;

public interface StringManipulator {

    String join(String s1, String s2);

    String takeFirst(String s, int length);

    default String upper (String s){
        return s.toUpperCase();
    }

    // a diferença entre um método static e um método default (ambos são implementados e visíveis)
    // o default é um método chamado depois da instancia pela classe que implementa StringManipulator
    // enquanto o static é estático, ou seja, pertence a interface em si e não à instância (ver App5)
    static String lower(String s) {
        return s.toLowerCase();
    }
}
