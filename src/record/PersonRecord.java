package record;

public record PersonRecord (String firstName, String lastName, int age){
    // com a criação de uma classe com modificador record não precisa criar construtores, ou métodos getters, ou toString
    // ou equals... pois o Java já realiza esse processo automaticamente tornando o código mais limpo e eficiente nesse caso
    // em que os atributos são imutáveis. (ver o executável)

}
