package day50_inheritance_hiding;

public class Engine {
    private String name;
    private int horsePower;
    private int cylinder;



    public Engine(String name, int horsePower, int cylinder) {
        this.name = name;
        this.horsePower = horsePower;
        this.cylinder = cylinder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }
}
