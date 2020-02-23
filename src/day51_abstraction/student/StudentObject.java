package day51_abstraction.student;

public class StudentObject {
    public static void main(String[] args) {
       // Student st = new Student;
    CalambaStudent calamba = new CalambaStudent();
    calamba.name = "May";
    calamba.getVisa();
    calamba.attendClass();
    calamba.code("Java");

        System.out.println("===========");

    CampusStudent cammpusSt = new CampusStudent();
    cammpusSt.name =  "Wali";
    cammpusSt.studentID = 12345;
    cammpusSt.attendClass();
    cammpusSt.playPingPong();
    cammpusSt.code("Python");




    }
}
