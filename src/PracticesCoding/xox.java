package PracticesCoding;

public class xox {
    public static void main(String[] args) {
        /*
        Print true if the string "x" and "o" appear
        the same number of times in the given string word.
         */

        String str = " bobtimetom";
        int countBob = 0;
        int countTom= 0;

        for (int i = 0; i <= str.length()-3; i++) {
            if (str.substring(i, i + 3).equals("bob")) {
                countBob++;
            }else if(str.substring(i, i + 3).equals("tom")) {
                    countTom++;
                }
            }

        System.out.println(countBob);
        System.out.println(countTom);
            }
        }