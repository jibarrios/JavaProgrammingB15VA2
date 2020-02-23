package Day34_MethodPractice;

public class FormartString {
    public static void main(String[] args) {
        System.out.println((getNumberOfGoogleSearch()));
        System.out.println();
        repeatString("java", 3,  '%');
    }
    public static Long getNumberOfGoogleSearch(){
        String results = "About 1,250,000,000 results (0.83 seconds)";
        String countOfRs= results.split(" ")[1]; // spilt & get index 1
       // System.out.println("countOfRs = " + countOfRs);

        countOfRs = countOfRs.replace(",", "");
        System.out.println("countOfRs = " + countOfRs);

        long count = Long.parseLong(countOfRs);// convert string # into long
        return count;


    }
    public static void repeatString(String word, int times, char delimiter){
        for (int i = 0; i < times ; i++) {
            System.out.print(word + delimiter);


            System.out.println(repeatReturnString("cats are funny",5,'!'));

        }
        System.out.println();
    }
  public static String repeatReturnString(String word, int times, char delimiter){
        String word1 = "";
      for (int j = 0; j < times ; j++) {
          word1 = word+delimiter;
      }
      return word1;
  }

}

