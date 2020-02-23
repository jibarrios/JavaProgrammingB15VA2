package Day08_If_Statements;

public class MultibranchIfStatementDay {
    public static void main(String[] args){
        int day = 13;

        if(day==1) {
            System.out.println("monday");
        }if(day==2) {
            System.out.println("tuesday");
        }if (day==3){
            System.out.println("Wednesday");
        }if(day==4) {
            System.out.println("thursday");
        }else if(day==5) {
            System.out.println("friday");
        }if(day==6) {
            System.out.println("Saturday");
        }if(day==7) {
            System.out.println("Sunday");
        }if(day>=8) {
            System.out.println("Not actual day");

        }
    }
}
