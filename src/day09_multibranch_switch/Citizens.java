package day09_multibranch_switch;

public class Citizens {
    public static void main(String[] args) {
        String citizenType = "";// empty string
        int age = 67;

        if (age >= 65) {
            citizenType = "Senior" ;//assign senior to citizen <--

        } else {
            citizenType = "Non-senior";
        }
        System.out.println("citizen type is " + citizenType);
        // ex) we see that we can can conditional assignment to citizenType variable
        //if condition is npt true we are


    }
}
