package walk;

@SuppressWarnings("ALL")
public interface Jumpable {

    // todos os métodos definidos em interfaces são automaticamente public e abstract
    // por isso não há necessidade de grafar isso na assinatura do método e as classes devem manter public explicitamente
    // porque há uma regra que tanto na herança, quanto na implementação, não se pode diminuir o nível de visibilidade
    // deixar sem o public na classe que está implementado a interface vai reduzir a visibilidade para package private
    void jump();
}
