package pet;

public class Cat extends EarthPet {

    @Override
    public void talk() {
        System.out.println("Miau");
    }

    // essa sobrescrita se tornou obrigatória por conta da classe Pet ter mudado para abstract
    @Override
    public void sleep(int time) {

    }
}
