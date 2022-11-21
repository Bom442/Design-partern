package builder.abstractfactory;

/**
 * 抽象工厂模式
 */
public abstract class AbstractFactory {

    abstract Computer getComputer();

    abstract Phone getPhone();

    abstract Router getRouter();
}
