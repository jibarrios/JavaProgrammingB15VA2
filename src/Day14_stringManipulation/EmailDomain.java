package Day14_stringManipulation;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "employee@hotmail.com";
        if (email.contains("gmail")) {
            System.out.println("Google Account");

        } else if(email.contains("@yahoo")) {
            System.out.println("Yahoo Account");

        }else if(email.contains("@hotmail.com")){
            System.out.println("Hotmail Account");
        } else if(email.contains("@icloud")){
            System.out.println("Apple Account");
        }else{
            System.out.println("someother email");
        }
    }
}
