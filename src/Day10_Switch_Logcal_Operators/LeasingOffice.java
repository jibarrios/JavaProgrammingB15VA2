package Day10_Switch_Logcal_Operators;

public class LeasingOffice {
    public static void main(String[] args){
        System.out.println("Welcome to cybertek Apartments");
        int numberOfBedrooms = 2;
        double startingPrice =0.0;

        switch(numberOfBedrooms){ // switch statement cant support two statements
            case 0:
                System.out.println("Studio is selected");
                startingPrice = 1200.0;
                break;
            case 1:
                System.out.println("One bedroom is selected");
                startingPrice = 1400.0;
                break;
            case 2:
                System.out.println("Two bedroom is selected");
                startingPrice = 1650.0;
                break;
            case 3:
                System.out.println("Three bedroom is selected");
                startingPrice = 1850.0;
                break;
            default:
                System.out.println("Number of Bedrooms is unavailable. Thank you! ");

        }
        System.out.println(startingPrice);
        if(startingPrice > 1300.0){
            System.out.println("Too expensive");
    }


    }
 }
