package OfficeHours;

public class MailingPackage {

    String nameFrom;
    String nameTO;
    String addressFrom;
    String addressTo;
    String shippingStatus;

    int weight;
    double shippingPrice;
    boolean  isInsured, hazardousContents;

    public void shipThePackage(double price,boolean insured){
        shippingStatus="LabelGenerated";
        shippingPrice= price;
        isInsured = insured;

    }
    public void packageInfo(){
        System.out.println("addressFrom: " + addressFrom
                           + "\naddressTo: " + addressTo
                           + "\nnameFrom: " + nameFrom
                           + "\nnameTo: " + nameTO
                           + "\nweight: "+ weight
                           + "\nshippingPrice: " + shippingPrice
                           + "\nshippingStatus: " + shippingStatus
                           +"\nisInsured: " + isInsured
                           + "\nhazardousContents: "+ hazardousContents);
    }
    public void loadToTheTruck(){
        shippingStatus = "InTransit";
    }
    public void delivery(){
        shippingStatus="delievered";
    }
    public void changeShippingAddress(String address){
        if(!shippingStatus.equalsIgnoreCase("delivered")){
        }else{
            System.out.println("Shipping address cannot be changed, already Delivered");

        }

        addressTo = address;
    }
}
