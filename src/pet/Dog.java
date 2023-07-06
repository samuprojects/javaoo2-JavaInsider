package pet;

public class Dog extends EarthPet {
    @Override
    public void talk() {
        System.out.println("Au-Au");
    }

    // essa sobrescrita se tornou obrigatória por conta da classe Pet ter mudado para abstract
    @Override
    public void sleep(int time) {

    }
}
