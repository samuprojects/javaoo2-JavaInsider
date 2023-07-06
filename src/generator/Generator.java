package generator;

@SuppressWarnings("ALL")
public interface Generator {

    int next(); // essa interface determina o controle de id que desejo para as instancias daclasse Person
    // porém na aplicação no momento da instanciação não pode instanciar Interfaces por isso criado uma classe
    // RandomGenerator para implementar de forma aleatória a criação dos ids
}
