package decorator;

public class CarDecorator implements Car{

    //可以被子修饰器访问
    protected Car car;

    public CarDecorator(Car c){
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
