package day51_abstraction.student;

public class CampusStudent extends Student{

    int studentID;

    @Override
    public void attendClass(){
        System.out.println("Campus Student attending class in campus");

    }
    public void playPingPong(){
        System.out.println("Campus Student  ");
    }

}
