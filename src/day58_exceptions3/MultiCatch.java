package day58_exceptions3;
import java.util.*;
public class MultiCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value: ");
        String str = scan.next();

        try {
            System.out.println("In try block....");
            int num = Integer.parseInt(str.substring(0, 3));
        } catch (StringIndexOutOfBoundsException e) { //12
            System.out.println("StringIndexOutOfBoundsException caught and handled");
            System.out.println("Message: " + e.getMessage());
        } catch (NumberFormatException e) { //abc123
            System.out.println("NumberFormatException caught and handled ");
            System.out.println("Message: " + e.getMessage());
            System.exit(0); //sutDown jvn);
        } catch (NullPointerException e) { //null
            System.out.println("NullPointerException caught and handled");
            System.out.println("Message: " + e.getMessage());
        }catch (Throwable e){
            System.out.println("Throwable exception was caught");
        }finally {
            System.out.println("Finally Block: Always runs");
            scan.close();//this closes the use of Scanner after curl
        }
        System.out.println("After MultiCatch Block...");
    }
}
