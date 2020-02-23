package day50_inheritance_hiding;

public class CapitalCity extends City{
    private String country;
    private long population;
    public int count; //hidden variable

    public CapitalCity() {
        super();
    }
    public CapitalCity(String name, String country,long population) {
        super(name);
        //setName(name) other way to get name since encapsulated
        this.country = country;
        //setCountry(country); other way to get it
        //best used for if conditions
        this.population = population;
    }

    public String getCountry() {
        return country;
    }
        public void letsBuildARoadInCapital(){
            System.out.println("Capital City - lets build a road");
            buildRoad();
    }
    public static void buildRoad(){
        System.out.println("Capital city - building a road...");
    }
    public String toString(){
        return super.toString() + " country = " +  country + " population = " + population;
//        //"name = " + getName() other way to get name from parent class
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
