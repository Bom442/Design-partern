package decorator;

public class SportsCar extends CarDecorator{

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("添加跑车属性");
    }
}
