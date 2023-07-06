package app;

import string.StringManipulator;
import string.StringManipulatorImpl;

public class App5 {

    public static void main(String[] args) {

        StringManipulatorImpl m = new StringManipulatorImpl();
        System.out.println(m.join("ab", "cd"));
        System.out.println(m.takeFirst("java", 2));
        System.out.println(m.upper("java"));

        // Aqui não precisamos instanciar nada para chamar o método diretamente na interface
        // ou seja as interfaces podem também receber private, default e static dependendo do cenário desejado
        System.out.println(StringManipulator.lower("JAVA"));
    }
}
