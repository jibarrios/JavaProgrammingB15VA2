package groupSession;

public class Animal {
    String name;
   static String color; //Static variable means class variable
    int age;
    private int size;

    public void eat(){
        System.out.println(name + "is eating" + color );
    }
    public static void sleep(){// color since it is static instant variable cant be used by static method
        //Only non-static method
        System.out.println("Animal is " + color);

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
