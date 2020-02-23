package Day29_StringReview;

public class EmployeesData {
    public static void main(String[] args) {

        String info = "Phil Salt [SDET] psalt@g.co";

        int p1 = info.indexOf("[");
        int p2 = info.indexOf("]");

        String job = (info.substring(p1 + 1, p2));
        System.out.println("p1= " + p1);
        System.out.println("p2= " + p2);
        System.out.println("Job is " + job);


        System.out.println(info.substring(info.indexOf("[") + 1, info.indexOf("]")));

          String firstName = info.substring(0,info.indexOf(" "));

        System.out.println("firstName = " + firstName);

        String lastName = info.substring(info.indexOf(" ")+ 1, info.indexOf(" ["));
        System.out.println("lastName = " + lastName);

        int secondSpace = info.indexOf(" ",info.indexOf(" ")+1);
        System.out.println("secondSpace = " + secondSpace);

        String lastName2 = info.substring(info.indexOf(" ")+1, secondSpace  );
        System.out.println("lastName2 = " + lastName2);

        int third = info.indexOf(" ", info.indexOf(" ", info.indexOf(" ")+1 )+1);
        System.out.println("third = " + third);

        System.out.println(lastName + " " +firstName);

        String [] strArr = info.split(" ");
        System.out.println("strArr length = " + strArr.length);

        String firstName3 = strArr[0];
        String lastName3 = strArr[1];
        System.out.println("firstName3 = " + firstName3);
        System.out.println("lastName3 = " + lastName3);


        String firstName4 = info.split(" ")[0];
        String lastname4 = info.split(" ")[1];

        System.out.println("firstName4 = " + firstName4);
        System.out.println("lastname4 = " + lastname4);

        System.out.println(info.split(" ")[3]); //email








    }
}
