package Review_Basics101;
import java.util.*;
public class SpeedRacer {
    public static void main(review_Man[] args) {
        Scanner scan = new Scanner(System.in);
        int speedLimit = 55;
        System.out.println("SpeedLimit is " + speedLimit);


        System.out.println("We found that your CurrentSpeed is ");
        int currentSpeed = scan.nextInt();

        if(currentSpeed > speedLimit) {
            int overSpeedLimit = currentSpeed - speedLimit;
            System.out.println("your above the speed limit by " + overSpeedLimit + "MPH");

        }else if(currentSpeed<speedLimit){
            int underSpeedLimit = speedLimit- currentSpeed;
            System.out.println("Your under the speed limit by " + underSpeedLimit +"MPH");

        }else{
            System.out.println("Great! your following speedLimit! Have a good day");
        }

    }
}
