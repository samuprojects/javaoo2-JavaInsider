package pet;

public class EarthPet extends Pet {

    public void walk(){
        System.out.println("EarthPet walk");

    }

    public void talk(){ // se acrescentar o modificador final em métodos não poderá ser sobrescrever em subclasses
        System.out.println("EarthPet talk");
        // as situações para uso do final são raras e via de regra não é usado para restrição

    }
}
