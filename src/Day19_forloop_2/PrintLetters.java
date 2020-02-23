package Day19_forloop_2;

public class PrintLetters {
    public static void main(String[] args) {
//        String name = "Juliza";
//        System.out.println(name.charAt(0)); // J
//        System.out.println(name.charAt(1)); // u
//
//        int n= 0;
//        System.out.println(name.charAt(n));
//        n++;
//        System.out.println(name.charAt(n));
//        n++;
//        System.out.println(name.charAt(n));
//        n = name.length()-1;  //n=6;

        //            0123456
        String name = "Juliza";

        for (int i = 0; i < name.length(); i++) {
            System.out.println(i + ":" + name.charAt(i) + " "); // loop variable (its the one changing

    }
        System.out.println();
        for(int idx = name.length()-1; idx >= 0;idx--){
       //     System.out.println(idx + " - " + name.charAt(idx));
            System.out.print(name.charAt(idx));

        }

    }
}
