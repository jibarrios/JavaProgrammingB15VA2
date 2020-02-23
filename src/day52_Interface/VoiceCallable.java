package day52_Interface;

public interface VoiceCallable {
    //public static final variables ONLY
    public static final boolean CAN_CALL = true;

    //abstract method .
    public abstract void call(String contact);

    /*
        Only abstract methods before Java 8. Pure abstraction
        /AFTER JAVA 8 - static and default methods are added
     */
    //static method:
    public static void decline(){
        System.out.println("Nadir declined voice call...");
    }

    //default method. method with default implementation that can be overridden
    public default void accept(){
        System.out.println("Nadir finally accepted voice call....");
    }
}

