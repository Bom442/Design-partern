package singleton;

/**
 * lazy loading,
 * DCl,线程安全
 */
public class Sin02 {

    private static volatile Sin02 INSTANCE;

    private Sin02() {
    }

    public static Sin02 getInstance() {
        if (INSTANCE == null) {
            //双重检查
            synchronized (Sin02.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Sin02();
                }
            }
        }
        return INSTANCE;
    }


}
