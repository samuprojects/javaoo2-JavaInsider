package pet;

public abstract class EarthPet extends Pet { // Assim como em Pet não faz sentido instanciar EarthPet por isso abstract

    public void walk(){ System.out.println("EarthPet walk"); }

    public void talk(){ System.out.println("EarthPet talk"); }

    // com essa implementação as subclasses não são obrigadas a implementar por si mesmas
    // pois a recebem por herança
    // abaixo de Pet precisa constar essa implementação OU aqui OU nas classes herdeiras mais abaixo
    @Override
    public void sleep(int time) {
        System.out.println("EarthPet sleeping");
    }
}

// comentário do Tadeu a respeito sobre uma dúvida em usar interface ou classe abstrata
//  interface é basicamente um contrato de implementação, ou seja, obrigatoriamente
//  você precisa implementar todos os métodos declarados numa interface,
//  só não é obrigatório implementar os métodos que utilizam o “default“ na assinatura,
//  pois para eles é possível dar uma implementação dentro da própria interface,
//  já nas classes abstratas, você só precisa implementar de forma obrigatória
//  os métodos abstratos, sendo que os demais métodos, que são concretos,
//  são sobrescritos apenas de forma opcional caso forem necessários.
//  Em se tratando de classes abstratas você pode “escolher“ os métodos que irá utilizar
//  à menos que eles sejam abstratos. Na interface você deve obrigatoriamente implementar
//  todos os métodos não “default“. Quanto aos “default“, você pode escolher se vai ou não utilizá-los

