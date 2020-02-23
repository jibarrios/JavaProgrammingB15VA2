package day46_inheritance_Intro;

public class SchoolTeam{

    public static void main(String[] args) {
        Person marufjon = new Person();
        marufjon.name = "Marufjon";
        marufjon.age = 34;
        marufjon.gender = 'M';

        Student nadir = new Student();
        nadir.name = "Nadir";
        nadir.age = 35;
        nadir.gender = 'M';
        nadir.course = "SDLC vs STLC";

        marufjon.walk();
        nadir.walk();

        marufjon.speak();
        nadir.speak();

        Employee kiki = new Employee();

        kiki.name = "kiki";
        kiki.age = 26;
        kiki.gender = 'F';

        kiki.walk();
        kiki.speak();

        kiki.jobTitle = "SDET";

       // marufjon.work()
        // does not work b/c
    }
}
