package day43_Constructers;

public class Cat {

    private String name;

    //constructor
    public Cat() {
        System.out.println("Cat constructor");
//Why do we need constructors
        //main purpose is initialize instance variables
        name = "unknown";//initaliza variable
    }

    public String getName() {
        return name;
    }

    public Cat(String name) {
        System.out.println("Cat constructor with name");
        this.name = name;
    }

    String str = new String("java");


}



