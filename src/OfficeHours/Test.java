package OfficeHours;

public class Test {
    /*
    OOP- Object Oriented Programming is developing the code using objects

    inheritance
    encapsulation
    abstraction        Topics asked in interviews
    polimorphism

    object is an instance of the class
    Creation of Object called Instantiation

    java class- Template/blueprint
    ex:
    building plan
    Builders can build unlimted amount of house w/ that plan
    House - object
    ------
    class is defined what an object properties & behaviors are

    properties/attributes/field - data fields w/ some values
    behaviors/ actions - defined by methods
    ===
    Task:
    create the class called mailingPackage
    define instant variables

    String:
    nameFrom
    nameTo
    addressFrom
    addressTo
    shippingStatus

    int:
    weight
    double: shippingPrice
    boolean:
    isInsured
    hazardousContents


    Behavior:
    shipThePackage() -> shippingStatus - labelGenerated
     */

    public static void main(String[] args) {
        MailingPackage package1 = new MailingPackage();
         package1.nameFrom = "Josh Miller";
         package1.nameTO= "Don Johnson";
         package1.addressFrom = "Tyson, VA";
         package1.addressTo= "New York, NY";
         package1.hazardousContents= false;
         package1.isInsured=true;
         package1.weight= 6;


         package1.packageInfo();
         package1.shipThePackage(20.0,true);
         package1.packageInfo();

         package1.loadToTheTruck();
         package1.packageInfo();

         package1.delivery();
         package1.packageInfo();

         package1.changeShippingAddress("Miami, FL");
         package1.packageInfo();
    }




}
