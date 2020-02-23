package Day18_forloop;

public class PrintStars {
    public static void main(String[] args) {

        for(int stars = 1; stars <= 10; stars++){
            System.out.print("* ");
        }
        String myStars= "";
        int starCount = 9;
     /*
     assign stars to myStars String variable.
     Count of stars must match value of starCount
      */
        System.out.println();
     for(int i = 1; i <= starCount; i++) {
         myStars+= "* ";

     }

        System.out.println("myStars = " + myStars);


    }
}
