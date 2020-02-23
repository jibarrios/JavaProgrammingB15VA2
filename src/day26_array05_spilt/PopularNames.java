package day26_array05_spilt;

import java.util.Arrays;

public class PopularNames {
    public static void main(String[] args) {
        String[] names = {"James", "Mary",
                "John", "Patricia",
                "Robert", "Jennifer",
                "Michael", "Linda",
                "William", "Elizabeth",
                "David", "Barbara",
                "Richard", "Susan",
                "Joseph", "Jessica",
                "Thomas", "Sarah",
                "Charles", "Margaret",
                "Christopher", "Karen",
                "Daniel", "Nancy",
                "Matthew", "Lisa",
                "Anthony", "Betty",
                "Donald", "Dorothy",
                "Mark", "Sandra",
                "Paul", "Ashley",
                "Steven", "Kimberly",
                "Andrew", "Donna",
                "Kenneth", "Emily",
                "George", "Carol",
                "Joshua", "Michelle",
                "Kevin", "Amanda",
                "Brian", "Melissa",
                "Edward", "Deborah",
                "Ronald", "Stephanie",
                "Timothy", "Rebecca",
                "Jason", "Laura",
                "Jeffrey", "Helen",
                "Ryan", "Sharon",
                "Jacob", "Cynthia",
                "Gary", "Kathleen",
                "Nicholas", "Amy",
                "Eric", "Shirley",
                "Stephen", "Angela",
                "Jonathan", "Anna",
                "Larry", "Ruth",
                "Justin", "Brenda",
                "Scott", "Pamela",
                "Brandon", "Nicole",
                "Frank", "Katherine",
                "Benjamin", "Samantha",
                "Gregory", "Christine",
                "Raymond", "Catherine",
                "Samuel", "Virginia",
                "Patrick", "Debra",
                "Alexander", "Rachel",
                "Jack", "Janet",
                "Dennis", "Emma",
                "Jerry", "Carolyn",
                "Tyler", "Maria",
                "Aaron", "Heather",
                "Henry", "Diane",
                "Jose", "Julie",
                "Douglas", "Joyce",
                "Peter", "Evelyn",
                "Adam", "Joan",
                "Nathan", "Victoria",
                "Zachary", "Kelly",
                "Walter", "Christina",
                "Kyle", "Lauren",
                "Harold", "Frances",
                "Carl", "Martha",
                "Jeremy", "Judith",
                "Gerald", "Cheryl",
                "Keith", "Megan",
                "Roger", "Andrea",
                "Arthur", "Olivia",
                "Terry", "Ann",
                "Lawrence", "Jean",
                "Sean", "Alice",
                "Christian", "Jacqueline",
                "Ethan", "Hannah",
                "Austin", "Doris",
                "Joe", "Kathryn",
                "Albert", "Gloria",
                "Jesse", "Teresa",
                "Willie", "Sara",
                "Billy", "Janice",
                "Bryan", "Marie",
                "Bruce", "Julia",
                "Noah", "Grace",
                "Jordan", "Judy",
                "Dylan", "Theresa",
                "Ralph", "Madison",
                "Roy", "Beverly",
                "Alan", "Denise",
                "Wayne", "Marilyn",
                "Eugene", "Amber",
                "Juan", "Danielle",
                "Gabriel", "Rose",
                "Louis", "Brittany",
                "Russell", "Diana",
                "Randy", "Abigail",
                "Vincent", "Natalie",
                "Philip", "Jane",
                "Logan", "Lori",
                "Bobby", "Alexis",
                "Harry", "Tiffany",
                "Johnny", "Kayla"};
        System.out.println("Names Count: " + names.length);
        System.out.println(Arrays.toString(names));

        int sarahIndex = -1;// assign -1 this value will stay if name not found
        //loop through the names & find out Where is sarah

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Sarah")) {
                // System.out.println(names[i]);
                sarahIndex = i;
                break;
            }

        }
        System.out.println("sarahIndex: " + sarahIndex);
            /*
            Males Names: James, John,...even
            Female Names: mary.....odd
             */
        System.out.print("MALE NAMES:");
        for (int i = 0; i < names.length; i += 2) {
            System.out.print(names[i] + ", ");
        }
        System.out.println();
        System.out.print("FEMALE NAMES: ");
        for (int j = 1; j < names.length; j += 2) {
            System.out.print(names[j] + ", ");

        }
        System.out.println();
        // solve using one loop
        String male = "";
        String females = "";
        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                male += names[i] + ", ";
            } else {
                females += names[i] + ", ";

            }

        }
        System.out.println("Males Names: " + male);
        System.out.println("Female Names: " + females);
        // check if "david" is among male NAme

        if (male.contains("David")) {
            System.out.println("David is here");
        } else {
            System.out.println("david is not here");
        }
//check if "susan" is among female  NAme
        if (females.contains("Susan")) {
            System.out.println("Susan is here");
        } else {
            System.out.println("Susan is not here");
        }

        // find the person w/ longest name and short name
        String longest = "";
        String shortest = names[0];

        for (int i = 0; i < names.length ; i++) {
            if(names[i].length() > longest.length()){
                longest = names[i];

            }
            if(names[i].length()< shortest.length()){
                shortest= names[i];
            }
        }

        System.out.println("Longest Name: " + longest);

        System.out.println("Shortest Name: " +shortest);


}





    }
