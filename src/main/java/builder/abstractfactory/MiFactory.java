package builder.abstractfactory;

/**
 * 为每个厂家创建一个工厂
 */
public class MiFactory extends AbstractFactory{

    @Override
    public Phone getPhone() {
        return new Phone();
    }

    @Override
    public Computer getComputer() {
        return new Computer();
    }

    @Override
    public Router getRouter() {
        return new Router();
    }
}
