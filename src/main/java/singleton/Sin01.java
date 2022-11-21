package singleton;

/**
 * 饿汉式 最常用的写法，只会在类加载时实例化一次， JVM保证线程安全 不管是否使用，类加载时就会完成实例化
 */
public class Sin01 {

    private static final Sin01 INSTANCE = new Sin01();

    private Sin01() {
    }


    public static Sin01 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Sin01 sin01 = Sin01.getInstance();
        Sin01 sin02 = Sin01.getInstance();
        System.out.println(sin01==sin02);
    }

}
