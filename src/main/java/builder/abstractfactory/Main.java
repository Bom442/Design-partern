package builder.abstractfactory;

/**
 * 产品族扩展
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new MiFactory();
        Phone phone = factory.getPhone();
        Computer computer = factory.getComputer();
        Router router = factory.getRouter();
        phone.phone();
        computer.compute();
        router.route();

    }

}
