package pet;

public class Dog extends EarthPet {
    @Override
    public void talk() {
        System.out.println("Au-Au");
    }

    // com a implementação do sleep pela classe EarthPet Dog pode assumiro uso método por herança
    // fica opcional sobrescrever para um novo comportamento, porém aqui só fica obrigatório
    // se a implementação da superclasse EarthPet for removida, aí Dog precisa obrigatoriamente implementar
    // isso ocorre porque de alguma forma a classe concreta (ou seja, aquela que instancia) precisa implementar
    // seja por herança ou por ela mesma o método abstrato da classe Pet
    @Override
    public void sleep(int time) {
        System.out.println("Dog sleeping");

    }

    // outro ponto é que não existe métodos abstratos em classes não abstratas
    // para criar métodos abstratos em sua classe ela precisa virar abstract
    // porém o contrárionão é verdadeiro, pois uma classe abstrata pode ter métodos não abstratos
    // porque no final ela continua sendo uma classe, podendo ter atributos, construtores, etc.
    // public abstract au(); // não compila se remover o comentário do código
}
