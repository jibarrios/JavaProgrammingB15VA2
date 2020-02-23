package day48_Overriding;

public class Employee extends Object{

    public void calculatePay(int hours, double rate) {
        System.out.println("Employee total pay: " + (hours * rate));
    }
    @Override
    public String toString(){
        return "Employee toString()";
    }

}

