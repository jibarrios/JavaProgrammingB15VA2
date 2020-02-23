package Day37_Arrayslist;
import java.util.*;
public class TeamsMates {
    public static void main(String[] args) {
        ArrayList<String> team = new ArrayList<>();
        team.add("Huseyin");
        team.add("Kateryna");
        team.add("Irma");
        team.add("Abubekir");
        team.add("Maksym");
        team.add("Cansu");
        team.add("Yasar");
        team.add("Hamza");
        team.add("Sergey");
        team.add("Olga");
        team.add("Nassif");
        team.add("Pavlin");
        team.add("Rahel");
        team.add("Jamel");
        team.add("Ozgur");

        System.out.println("Team Size: " + team.size());
        System.out.println(team.get(0) + " | " + team.get(team.size() - 1));

        for (String eachPerson : team) {
            System.out.println(eachPerson);
        }
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i));
        }

        // print each Person in Reverse order

        for (int j = team.size() - 1; j >= 0; j--) {
            System.out.print(team.get(j) + ", ");
        }
        System.out.println();
        //Print 2 people at time
        for (int n = 0; n < team.size(); n += 2) {
            if (n == team.size() - 1) { // below is need if list is odd
                System.out.println(team.get(n));
            } else {
                System.out.println(team.get(n) + " | " + (team.get(n + 1)));

            }
        }
        //declare String allteam and add everyone into that String
        //Separated by -
        //marufjon - vasyl- master Muhtar
        //print out all team

        String allTeam = "";
        for (String eachPerson : team) {
            allTeam += eachPerson + " - ";
        }
        allTeam += allTeam.substring(0, allTeam.length() - 3);
        System.out.println("allTeam = " + allTeam);





        }
    }

