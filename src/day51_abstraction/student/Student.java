package day51_abstraction.student;

public abstract class Student {
    String name;

    public Student(){
        System.out.println("Student Constructor... ");

    }

    public abstract void attendClass();

    public void code(String lan){
        System.out.println("Student is coding... " + lan);
    }

}
