package pet;

public abstract class EarthPet extends Pet { // Assim como em Pet não faz sentido instanciar EarthPet por isso abstract

    public void walk(){
        System.out.println("EarthPet walk");

    }

    public void talk(){
        System.out.println("EarthPet talk");

    }
}
