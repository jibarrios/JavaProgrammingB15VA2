package OfficeHours;

public class HotdogStand {
    private int numberOfSold;
    public static int totalNumberOfSold;
    private String streetAddress;

    public HotdogStand(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public static void printTotalNumberOfSold(){
        System.out.println("Total number of sold: " + totalNumberOfSold);
    }
    public void sold(){
        System.out.println("sold");
        numberOfSold++;
        totalNumberOfSold++;
    }
    public String toString() {
        return "HotdogStand{" +
                "numberOfSold=" + numberOfSold +
                ", streetAddress='" + streetAddress + '\'' +
                '}';
    }
}

