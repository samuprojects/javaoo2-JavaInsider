package walk;

@SuppressWarnings("ALL")
public class Person implements Walkable, Jumpable { // uma classe pode implementar várias interfaces
    // diferente da classe que só pode estender de uma superclasse no quesito herança.

    private int steps;
    private int distancePerStep;

    @Override
    public void walk() {
        steps++;
        distancePerStep += 10;
    }

    @Override
    public void stop() {
        steps = 0;

    }

    @Override
    public void jump() {
        walk();
        walk();

    }
}
