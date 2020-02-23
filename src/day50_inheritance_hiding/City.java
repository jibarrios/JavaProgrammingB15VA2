package day50_inheritance_hiding;

public class City extends Object {
    private String name;

    public City() {
        name= "undefine";
    }

    public City(String name) {
        this.name = name;
    }
    public void letsBuildARoad(){
        System.out.println("City - lets build a road");
        buildRoad();
    }
    public static void buildRoad(){
        System.out.println("City - building a road...");
    }
    @Override // Reason it considered overriding b/c its inherited
    // from Object class
    public String toString(){
        return "name = " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
