package Day34_MethodPractice;

public class WarmupMethods {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
       System.out.println("Enter your user name and password :");
        //login(scan.next(),scan.next());
        login("STudent@cybertek.com","cybertekb15");

        drive("tesla",55);
        drive("honda",202);
        drive("toyota",-1);

    }
    public static void login(String userName, String password){
        if (userName.equalsIgnoreCase("student@cybertek.com") && password.equals("cybertekb15")){
            System.out.println("Login Successful, Welcome to Cybertek!");
        }else{
            System.out.println("ERROR: Login Failed - Invalid credentials!");
        }
    }
    public static void drive(String car , int speed){
        if (speed<0){
            System.out.println("Invalid Speed, cannot be negative");
        }else if(speed==0){
            System.out.println(car + " car is moving at 0 speed");
        }else if(speed<=55){
            System.out.println("car is driving at 40mph");
        }else if(speed>55 && speed<200){
            System.out.println(car + " car is speeding at " + speed + " mph");

        }else if(speed>=200){
            System.out.println(car + " is flying at " + speed + " mph");
        }
    }
}
