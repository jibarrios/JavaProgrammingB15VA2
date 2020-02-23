package day46_inheritance_Intro;

public class SmartPhone extends Phone {
    public int memorySize;

    public void useApp(String appName) {
        System.out.println("Using " + appName + " in " + brand + " smartphone...");
    }
}
