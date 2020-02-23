package GroupStudy;

import javax.swing.*;

public class Start_End {
    public static void main(String[] args) {
        String[] arr = {"Strong", "Happy", "Create", "Free", "stubborn"};
        String ls = "";

        for (int i = 0; i < arr.length; i++) {
            String l1 = arr[i].substring(0, 1);
            String l2 = arr[i].substring(arr[i].length() - 1);
            ls += l1 + l2 + ", ";

        }
        System.out.println("[" + ls.substring(0, ls.length() - 2) + "]");


        String[] sen = {"Hello", "I'm", "Juliza"};


        }

    }


