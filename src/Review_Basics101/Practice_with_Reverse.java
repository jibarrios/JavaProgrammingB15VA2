package Review_Basics101;

public class Practice_with_Reverse {
    public static void main(String[] args) {
        String help = "Juliza Relax your going to get there";
        String h1 = help.replace(" ", "");
        String h2 = "";

        for (int i = help.length() - 1; i >= 0; i--) {
            h2 += help.charAt(i);

        }
        String neg = "";
        System.out.println(h2);
        for (int j = h1.length()-1; j >= 0 ; j--) {
            neg += h1.charAt(j);
        }
        System.out.print(neg);
        System.out.println();
        String[] h3 = help.split(" ");
        for (int i = h3.length - 1; i >= 0; i--) {
            System.out.print(h3[i] + " ");// Remember i only exist w/in the loop
            // i is the thing that's making it go backwards
        }
        String str = "I hope you got this!";
        String str2 = "";

        for (int j = str.length()-1; j >= 0; j--) {
            str2 += str.charAt(j);

        }
        System.out.println();
        System.out.println(str2);


        String[] hope = str.split(" ");
        for (int i = hope.length -1; i >= 0 ; i--) {
            System.out.print(hope[i] + " ");


        }
        System.out.println();
        String sentence = "I love Java";
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);



        }




        }




    }


