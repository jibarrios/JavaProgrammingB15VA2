package Repl_it;

public class Longest {
    public static void main(String[] args) {
        String[] words = {"seen", "Juliza", "longests", "wow", "Random"};

        String longest = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }

        }
        System.out.println(longest);

        String[] str = {"apple", "Red", "Cookie", "bread", "Protein"};
        String shortest = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < shortest.length()) {
                shortest = str[i];
            }
        }
        System.out.println(shortest);


        //Print HAlf twice
        String w = "Facebook";

        String w2 = w.substring(0,w.length()/2)+w.substring(0,w.length()/2);
        System.out.println(w2);




        String email = "Hello Alex We need to address ...";

        if(email.contains("Alex")){
            System.out.println("Read this mail");
        }else{
            System.out.println("dont read");
        }

    }

    }

