package builder.simplefactory;

public class Fruit {

    private final String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + '@' + hashCode();
    }
}
