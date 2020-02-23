package Day37_Arrayslist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Mclean");
        cities.add("Alexandria");
        cities.add("Baltimore");
        cities.add("Baku");
        cities.add("Tashkent");
        cities.add("Tehran");
        cities.add("Asmara");
        cities.add(0,"Calamba"); // add calamb w/ index 0
        cities.add(1, "Reston"); // add reston to index 1

        System.out.println(cities);

        cities.add(2,"Yerevan");
        System.out.println(cities);

        //Change index 4 ( alexandria to New york)
        cities.set(4,"New York"); // Set is Used to Replace and existing
        //variable w/ a different variable
        cities.set(5,"Samarkand");


        System.out.println(cities.toString());

        //Remove Element |value at index 3

        cities.remove(3);
        System.out.println(cities.toString());

        cities.remove("New York");
        System.out.println(cities);

    }


}
