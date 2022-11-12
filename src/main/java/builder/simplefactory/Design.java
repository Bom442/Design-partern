package builder.simplefactory;

/**
 * 应用设计模式之后
 */
public class Design {

    public static void main(String[] args) {
        Fruit fruit = FruitFactory.getFruit("apple");//直接问工厂要，不是自己创建
        System.out.println(fruit);
    }

}
