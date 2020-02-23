package day47_inheritance2;

public class FullTimeEmployee extends Empolyee {
    private double bonus;

    public FullTimeEmployee(String name, String title, double bonus) {
        super(name, title);
        this.bonus = bonus;
    }

    public  FullTimeEmployee(){
        super();//if we dont add super, compiler will add
        System.out.println("FULLTIMEEMPOLYEE NO_Args Constructor");
        // super() needs to to be applied first
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
