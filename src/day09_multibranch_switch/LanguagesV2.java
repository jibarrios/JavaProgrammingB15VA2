package day09_multibranch_switch;

public class LanguagesV2 {
    public static void main(String[] args) {
        String languages = "";
        String greeting = "";
        int option = 1;
        if (option == 1) {
            languages = "English";
            greeting = "Hello!";
        } else if(option == 2) {
            languages = "Espanol";
            greeting = "Hola";
        } else if(option == 3) {
            languages = "Francais";
            greeting = "bonjour";
        } else if(option == 4) {
         languages = "Arabia";
         greeting = "Salam";
        }else if(option==5) {
            languages = "russky";
            greeting = "Privet!";
        }else if(option == 6) {
            languages = "tukce";
            greeting = "Merhhba";
        }else{
            languages = "l'taliano";
            greeting = "Ciao!";

        }
        System.out.println(languages + " : " +greeting);
    }
}
