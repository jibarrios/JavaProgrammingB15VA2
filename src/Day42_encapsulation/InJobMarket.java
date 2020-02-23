package Day42_encapsulation;

public class InJobMarket {
    public static void main(String[] args) {
        JobOffer fannie = new JobOffer();
        fannie.setHourlyPay(55);
        fannie.setLocation("Herndon, VA");

        System.out.println(fannie.toString());
        System.out.println();

    }
}
