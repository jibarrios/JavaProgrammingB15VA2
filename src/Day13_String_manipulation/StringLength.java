package Day13_String_manipulation;

public class StringLength {
    public static void main(String[] args) {
        String school = "Cybertek School";
        System.out.println(school.length());
        // Store school length into a int variable - count
        int count = school.length();
        System.out.println(school + " is " + count + " characters");

        String firstName = "Juliza";
        String lastName = "Barrios";
        int fullNameCount = (firstName.length() + lastName.length());
        System.out.println("Full Name Count = " + fullNameCount);
        System.out.println("Full Name Count = " + (firstName.length() + lastName.length()));


        String password = "Jjks5734";
        // check if the password is more than or equal to 8 characters.
        //if yes, "password length matches requirement"
        //if not "
        if(password.length() >= 8) {
            System.out.println("password length matches requirement");
        }else{
            System.out.println("password is to short. Needs to be minumum 8 characters");
        }
        int plength = password.length();
        if(plength >= 8 && plength <= 16){
            System.out.println("password length matches requirement");
        }else{
            System.out.println("password does not meet Requirements");
        }




    }
}
