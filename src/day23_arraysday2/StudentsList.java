package day23_arraysday2;

public class StudentsList {
    public static void main(String[] args) {
        String [] students = new String[7];
        students[0] = "amy";
        students[1] = "joe";
        students[2] = "bobby";
        students[3] = "alex";
        students[4] = "dawn";
        students[5] = "emily";
        students[6] = "todd";


        String [] names = {"Juliza", "Usama", "Mardan", "Hassen", "fernando"};

        System.out.println("total Students: " + students.length);
        System.out.println("first student : " + students[0]);

        for (int i = 0; i < students.length; i++) {
            System.out.println((i +1) +". " + students[i] + " >> " + students[i].length());
        }// why i+1?

        for(String friends : students) {
            System.out.println(friends + " >> " + friends.length());

            String friend1 = students[0];
            System.out.println(friend1 + " >> " + friend1);

            int counter = 0;
            for (String friend : students) {
                System.out.println(counter + ". " + friend + " >> " + friend.length());
                counter++;
            }

            String allFriends = "";
            for (String friend : students) {
                allFriends += friend + ", ";
            }
            allFriends = allFriends.substring(0, allFriends.length()-2);
            System.out.println("allFriends = " + allFriends);
        }
        /*
        print 2 friends at a time
        "alina", "Catalina"
         */
        for (int i = 0; i <students.length; i+= 2) {
            if(i == students.length -1) { // if you have odd # of names/list. it
                // will print out last item by itself
                System.out.println(students [i]);
            }else {
                //System.out.println("i" + i);
                System.out.println(students[i] + ", " + students[i + 1]);  // if it's even its good!
                // count the value of i is

            }
        }
           // 0 [1] 2 [3] 4 [5] 6 [7] 8


    }
}
