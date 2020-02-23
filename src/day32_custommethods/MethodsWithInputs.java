package day32_custommethods;

public class MethodsWithInputs {
    public static void main(String[] args) {
     displayMessage("Java is fun!");
     displayMessage("coding Java today");
     greetByName("Bobby");
     String someName = "Omar Faruk";
     greetByName(someName);
     count(5);
     count(100);
    }


   public static void displayMessage(String message){
       System.out.println("message: "+ message);

    }
    public static void greetByName(String name){
        System.out.println("Hello, " + name +", how are you?");

    }
    public static void count(int num){
        for (int j = 0; j <= num; j++) {
            System.out.print(j + " ");

        }
        System.out.println();
    }
}
