package day50_inheritance_hiding;

public class CityObject {
    public static void main(String[] args) {
        City city = new City("Calamba");
        CapitalCity capital = new CapitalCity("Moscow","Russia",1230000L);

        System.out.println(city.toString());
        System.out.println(capital.toString());


        //static way of calling: CallName.methodName
        City.buildRoad();
        CapitalCity.buildRoad();


        //calling using object
        city.buildRoad();
        capital.buildRoad();

        //Test method hiding
        CapitalCity astana = new CapitalCity("Astana","Kazakhstan",200000L);
        astana.letsBuildARoad();//this calling buildARoad which is hidden

        //LetsBuildARoad() method is in city class
        //LetsBuildARoadInCapital() method is in capitalCity class
        //coth of them are calling BuildARoad() method

        CapitalCity ankara = new CapitalCity("Ankara", "Turkey",2345000L);
        ankara.letsBuildARoad();//code will run in city class/parent
        // ankara.letsBuildARoad(); -> calls buildARoad() in city class.
        ankara.letsBuildARoadInCapital();
        //ankara.letsBuildARoadInCapital(); calls buildARoad() in CapitalCity
    }
}
