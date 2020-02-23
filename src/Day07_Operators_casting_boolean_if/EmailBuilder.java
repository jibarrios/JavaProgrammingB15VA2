package Day07_Operators_casting_boolean_if;
import java.util.Scanner;
public class EmailBuilder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your New Company!");
        System.out.println("Enter first name, last name, company name");
        String firstName = scan.next();
        String lastName = scan.next();
        String companyName = scan.next();
        // for this example we on take one name company
        String email = (firstName+"_"+lastName+ "@"+ companyName+".com");
        System.out.println("Your email: " + email);


    }
}
