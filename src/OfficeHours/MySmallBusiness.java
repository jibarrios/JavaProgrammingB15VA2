package OfficeHours;

public class MySmallBusiness {
    public static void main(String[] args) {
        HotdogStand hotdogStand = new HotdogStand("101 Consitution Ave, Falls Church VA 22041");
        HotdogStand hotdogStand2 = new HotdogStand("301 setter Ave, Falls Church VA 22041");
        hotdogStand.sold();
        hotdogStand.sold();
        hotdogStand2.sold();
        System.out.println(hotdogStand);
        System.out.println(hotdogStand2);
        System.out.println("Total: " + HotdogStand.totalNumberOfSold);
        HotdogStand.printTotalNumberOfSold();
    }

}
