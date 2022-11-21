package builder.abstractfactory;

public class MiFactory extends AbstractFactory {

    @Override
    Computer getComputer() {
        return new MiComputer();
    }

    @Override
    Phone getPhone() {
        return new MiPhone();
    }

    @Override
    Router getRouter() {
        return new MiRouter();
    }
}
