package builder.simplefactory;

/**
 * 简单工厂
 */
public class FruitFactory {

    /**
     * 静态方法根据类型进行创建
     * @param type 水果类型
     * @return  水果对象
     */
    public static Fruit getFruit(String type) {
        switch (type) {
            case "apple":
                return new Apple();
            case "orange":
                return new Orange();
            default:
                return null;
        }
    }

}
