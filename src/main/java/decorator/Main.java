package decorator;

public class Main {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        //可以灵活的对BasicCar进行装饰
        Car sportLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assemble();
    }
}
