package day59_exceptions_collection1;

public class ThrowsKeyword {
    public static void main(String[] args) { // also to do
        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep (int seconds) throws  InterruptedException{
        System.out.println("Sleeping for " + seconds + " Seconds");
        Thread.sleep(seconds *1000);  // if you handle it here! you have to do anything in the main method
    }
    public static void MyMethod() throws NullPointerException{ // Since
        System.out.println("myMethod, I might throw NullPointer Exception");
    }
}
