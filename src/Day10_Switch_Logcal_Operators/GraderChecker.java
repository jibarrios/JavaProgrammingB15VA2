package Day10_Switch_Logcal_Operators;

public class GraderChecker {
    public static void main(String[] args){

        char grade1 = 'A';
            switch(grade1){
        case 'A':// if(grade = 'a');
            System.out.println("Excellent");//Also you can do
            // case 'A': System.out.print(excellent); break; in same line!!
            break;
            case'B':
                System.out.println("Good");
                break;

            case 'C':
                System.out.println("fair");
                break;
            case 'D':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Unknown grade");


    }
        System.out.println("##### End of Grader Checker ####");
} }
