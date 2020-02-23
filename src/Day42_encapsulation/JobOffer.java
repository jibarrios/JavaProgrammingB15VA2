package Day42_encapsulation;

public class JobOffer {
    private int hourlyPay;
    private String location;

    public void setHourlyPay(int hourlyPay) {
       this.hourlyPay = hourlyPay;

    }

    public void setLocation(String newLocation) {
        location = newLocation;

    }

    public int getHourlyPay() {
        return hourlyPay;
    }


    public String getLocation() {
        return location;
    }
}
