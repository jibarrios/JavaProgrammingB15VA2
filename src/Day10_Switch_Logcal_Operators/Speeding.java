package Day10_Switch_Logcal_Operators;

public class Speeding {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 15;

        if (currentSpeed >= 90){
            System.out.println("Jail Time");
        } else if (currentSpeed >= 80) {
        System.out.println("Reckless Driving");
    }else if(currentSpeed > 70) {
            System.out.println("Speeding ticket and points");
        }else if(currentSpeed > 60){
            System.out.println("warning");
        }else{
            System.out.println("Keeping Driving and think Java");



    }
    }

}
