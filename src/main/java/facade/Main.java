package facade;

public class Main {

    public static void main(String[] args) {
        //not use facade
        new Designer().design();
        new WaterElectricWorker().work();
        new Bricklayer().work();

        System.out.println("--------------------");

        //use facade
        DecorationCompany.decorate();
    }

}
