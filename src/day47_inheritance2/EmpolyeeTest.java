package day47_inheritance2;

public class EmpolyeeTest {
    public static void main(String[] args) {
        FullTimeEmployee ftEmpolyee = new FullTimeEmployee();
        FullTimeEmployee emp = new FullTimeEmployee("Jamil", "SDET",5);
        System.out.println(emp.getName());
        System.out.println(emp.getTitle());
        System.out.println(emp.getBonus());


    }
}


