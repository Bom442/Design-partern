package decorator;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("添加豪车特性");
    }
}
