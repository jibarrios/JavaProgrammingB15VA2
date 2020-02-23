package day11_String_comparsion_logical;

public class WeatherIfElse {
    public static void main(String[] args) {
        String weather = "sunny";
        if(weather.equals("sunny")) { // == shouldnt be use on string
            // Comparsions
            System.out.println("Go to park");
            System.out.println("Code Java");
        }else{
            System.out.println("go to school");
            System.out.println("Code Java");

        }
        String item = "Wooden SPOON";
        if(item.equals("Wooden Spoon")) {
            System.out.println("15,938 wooden spoons for sale");
        }else{
            System.out.println("No Wooden Spoons ):");
        }


        if(item.equalsIgnoreCase("Wooden Spoon")){
            System.out.println("15,938 wooden spoons for sale");
        }else{
            System.out.println("No Wooden Spoons ):");
    }
}}
