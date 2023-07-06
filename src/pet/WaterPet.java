package pet;

@SuppressWarnings("ALL")
public abstract class WaterPet extends Pet { //assim como Pet não faz sentido instanciar WaterPet

    public void swin(){
        System.out.println("WaterPet swin");
    }
}
