package pet;

public class Fish extends WaterPet {

    // essa sobrescrita se tornou obrigatória por conta da classe Pet ter mudado para abstract
    @Override
    public void sleep(int time) {

    }
}
