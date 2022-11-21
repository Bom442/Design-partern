package Facade;

/**
 * <p>
 *     门面模式-为子系统中一组接口提供统一的接口，
 *     定义了时子系统更加易于使用的接口，
 *     客户端更容易与系统交互
 * </p>
 */

public class DecorationCompany {

    public static void decorate(){
        System.out.println("装修公司整合--门面");
        new Designer().design();
        new WaterElectricWorker().work();
        new Bricklayer().work();
        System.out.println("done!");
    }

}
