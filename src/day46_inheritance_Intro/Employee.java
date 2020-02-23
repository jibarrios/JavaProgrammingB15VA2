package day46_inheritance_Intro;

public class Employee extends Person {
    public String jobTitle;



    public void work(){
        System.out.println(name + " is Working hard as " + jobTitle);

    }

}
