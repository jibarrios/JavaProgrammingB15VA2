package day48_Overriding;

public class Contractor extends Employee {


    @Override
    public void calculatePay(int hours, double rate) {
        double pay = (hours* rate) + 200;
        System.out.println("Employee total pay: " + pay);

    }
    @Override
    public String toString() {
        return "Contractor toString() | " + super.toString();// super.toString translate
        // for the parent(super) class version (Method)
    }
}
