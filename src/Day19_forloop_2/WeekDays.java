package Day19_forloop_2;

public class WeekDays {
    public static void main(String[] args) {
        // write a for loop that will iterate from 1-7
        //use a conditional statements inside the loop
        // multi branch if statement or switch
       for(int n = 1;n <= 10; n++){
          // System.out.print("n: " + n);
        switch(n) {
            case 1:
                System.out.println(n +". Monday ");
                break;
            case 2:
                System.out.println(n+ ". Tuesday ");
                break;
            case 3:
                System.out.println(n +". wednesday ");
                break;
            case 4:
                System.out.println(n+ ". Thursday ");
                break;
            case 5:
                System.out.println(n+ ". Friday");
                break;
            case 6:
                System.out.println(n+ ". Saturday");
                break;
            case 7:
                System.out.println(n +". Sunday");
                break;
            default:
                System.out.println("invalid entry");
        }

        }

    }
}
