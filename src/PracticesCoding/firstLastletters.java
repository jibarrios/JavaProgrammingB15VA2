package PracticesCoding;

public class firstLastletters {
    public static void main(String[] args) {
        String[] name = {"Juliza", "Barrios"};
        System.out.println(name[0].substring(0,1) + name[0].substring(name[0].length()-1,name[0].length()));
        System.out.println(name[1].substring(0,1) + name[1].substring(name[1].length()-1,name[1].length()));


        String [] cars = {"NSX","I8","Limbo","911 Carrera","R8", "Ferrei","GTR","Rolls Royces"};
                 for (int j = 0; j < cars.length; j++) {

                     System.out.println(cars[j].substring(0,1) + cars[j].substring(cars[j].length()-1,cars[j].length()));

            String [] sweets ={"Cookies", "ice cream", "donuts", "SweetTarts", "Muffins"};
                     for (int n = 0; n < sweets.length; n++) {
                         System.out.println(sweets[n].substring(0,1) + sweets[n].substring(sweets[n].length()-1,sweets[n].length()));

                     }

        }

    }
}
