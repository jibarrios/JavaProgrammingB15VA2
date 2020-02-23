package day48_Overriding;

public class FullTimeEmployee extends Employee{

    @Override
    public void calculatePay(int hours, double rate) {
        double pay = + (hours * rate) * 1.25;
        System.out.println("Employee total pay: " + pay);

    }
    @Override
    public String toString(){
        return "FullTimeEmployee toString()";
    }
}
