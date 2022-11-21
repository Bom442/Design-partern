package strategy;

public class Cat {

    int weight;
    int height;

    public Cat(int weight, int height) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
            "weight=" + weight +
            ", height=" + height +
            '}';
    }
}
