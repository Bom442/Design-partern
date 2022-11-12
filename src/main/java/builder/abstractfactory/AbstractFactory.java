package builder.abstractfactory;

/**
 * 抽象工厂模式
 */
public abstract class AbstractFactory {

    public abstract Phone getPhone();

    public abstract Computer getComputer();

    public abstract Router getRouter();
}
