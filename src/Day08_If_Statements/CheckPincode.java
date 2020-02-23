package Day08_If_Statements;

public class CheckPincode {
    public static void main(String[] args) {
        System.out.println("Welcome to Wells Fargo Atm");
        int secretPincode = 2345;
        int inputPincode = 2345;
        // if inputPincode matches the secret one.
        if (inputPincode == secretPincode) {
            //if match its true comment below print out
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw,deposit,view balances");
        } else { // if statement is false the comment below print out
            System.out.println("Invalid pincode!");
            System.out.println("Access denied");

        }// we need three curl bracket or creates error.if there is if statement.
System.out.println("Thank you! come again! ");
        // This after curl Bracket so will always print out
        }

    }
