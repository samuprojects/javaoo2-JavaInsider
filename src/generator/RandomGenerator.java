package generator;

import java.util.Random;

@SuppressWarnings("ALL")
public class RandomGenerator implements Generator{

    // Essa classe vai implementar a interface Generator, ou seja, o método next()
    private final Random random = new Random();

    @Override
    public int next() {
        return random.nextInt(1, 10); // nesse caso nextInt vai retornar um próximo inteiro aleatório com intervalo de 1 a 9
    }
}
