package Day42_encapsulation;

public class people {
    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.name = "abcd"; ERROR NAME IS PRIVATE
//        p1.age = -22; ERROR AGE IS PRIVATE
        System.out.println(p1.toString());
        p1.setName("Vasyl");
        System.out.println(p1.getName());
        System.out.println(p1.toString());

        Person p2 = new Person();
        p2.setName("Sarah");
        System.out.println(p2.getName());

        p2.setAge(-3);
        System.out.println(p2.getAge());
        p2.setAge(44);
        System.out.println("Sarah's Age: " + p2.getAge());

    }
}
