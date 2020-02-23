package day11_String_comparsion_logical;

public class USStates {
    public static void main(String[] args) {
        String states = "VA";
        if(states.equals("VA")){
            System.out.println("Virgina");
        }else if(states.equals("NY")){
            System.out.println("New York");
        }else if(states.equals("IL")){
            System.out.println("Illinois");

        }else if(states.equals("IL")){
            System.out.println("California");
        }else { // When using else for the end you need to use else for everything
            // else if not last statement will print out
            // must use else! when using this method
            System.out.println("Some states, not in database");
        }
    }
}
