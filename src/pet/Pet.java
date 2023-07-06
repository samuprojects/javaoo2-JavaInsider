package pet;
@SuppressWarnings("ALL")

// não faz sentido instanciar objetos Pet porque essa classe foi criada para colocar atributos e métodos comuns a vários animais
// por isso criar objetos Pet como em App6 deve ser abolido transformando a superclasse Pet em abstrata
// ou seja não será mais possível instanciar objetos dessa classe e o código foi comentado em App6 por causa do compílador
public abstract class Pet {
    private String color;
    private int amountEaten;

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void feed(int amount) {
        amountEaten += amount;
    }

    public int getAmountEaten() {
        return amountEaten;
    }
}
