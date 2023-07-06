package pet;
@SuppressWarnings("ALL")

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

    // com a mudança da classe Pet para abstract podemos utilizar métodos abstratos
    // esses métodos tem comportamento semelhante aos métodos da Interface contendo apenas a assinatura
    // e nas subclasses eles serão obrigatórios de implementar e sobrescritos conforme cada animal
    public abstract void sleep(int time);
}
