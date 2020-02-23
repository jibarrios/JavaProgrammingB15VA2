package day32_custommethods;

public class VotingCheck {
    public static void main(String[] args) {
        checkIfCanVote(19);
        checkIfCanVote(17);
        printAge(1995);
        printAge(1997);
    }
    public static void checkIfCanVote(int age) {
        if (age >= 18) {
            System.out.println("you are eligible to vote ");
        } else {
            System.out.println("you are not eligible to vote");
        }
    }
         public static void printAge(int birthYear) {
        int age = 2019-birthYear;
             System.out.println("birthYear: " + birthYear + " age: " + age);



    }
}
