package pet;
@SuppressWarnings("ALL")
public class Pet { // se acrescentar o modificador final em classes não poderá ser extendida em subclasses
    private String color;
    // as situações para uso do final são raras e via de regra não é usado para restrição
    // ficar atento para situações específicas com o conceito, por exemplo, de sobrescrever uma classe
    // que no caso da classe String do Java, ver documentação, é definida como final e tem um corportamento bem específico
    // por isso não pode herdar de String

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
