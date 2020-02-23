package day22_arrays_intro;

public class Cities {
    public static void main(String[] args) {
        String[] cities ={"Ankara", "Moscow", "Baku", "Kabul", "Manila", "Tahkent", "Bucharest"};
        for(String city : cities){
            System.out.print(city +" = " + city.toUpperCase() +" ");
        }
        System.out.println();
        // print city only if it has more than 6 characters
        for(String city: cities){
        if(city.length() > 6) {
            System.out.print(city + " " + city.toUpperCase() + " ");
        }
        }
        System.out.println();
// print only cities that contains 'u'
        for(String city : cities){
            if(city.contains("u")){
                System.out.print(city + " ");

            }
        }


    }
}
