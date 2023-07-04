package walk;

@SuppressWarnings("ALL")
public interface Jumpable {

    // atributos em interfaces não tem qualquer ligação com a instanciação dos objetos das classes que implementam a interface
    int height = 5; // esses atributos são por padrão public e static por isso são acessíveis em todas as instâncias e imutáveis

    void jump();
}
