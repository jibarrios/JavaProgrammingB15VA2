package Day40_Custom_Classes;

public class Car {

    String model;
    double price;
    String color;
    int year;
//acura.setCarInfo("Acura NSX", 44332, "blue" 2018);
public void setCarInfo(String newModel, double newPrice, String newColor, int newYear){
    //assign param variables to object variables
    model= newModel;
    price = newPrice;
    color = newColor;
    year = newYear;
}

public void drive(){
    System.out.println(model + " is driving...");

}
public void showPrice(){
    System.out.println(model + " Price is $" + price);

}
public void getCarInfo(){
    System.out.println("car: " + model + ", " + price + ", " + color + ", " +year);

    }
}
