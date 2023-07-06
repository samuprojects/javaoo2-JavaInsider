package generator;

@SuppressWarnings("ALL")
public class Person {

    private int id;

    public Person(Generator g) {
        this.id = g.next();
    }

    public int getId() {
        return id;
    }
}
