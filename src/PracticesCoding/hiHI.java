package PracticesCoding;

public class hiHI {
    public static void main(String[] args) {

    String str = "abc love noh lovehap love soolov dfrlove";
           int count  = 0;
        for(int i= 0; i<=str.length()-4;i++) { // <= need to be the same # of characters as
            // the word we are looking for
            String temp = str.substring(i,i+4);
            if(temp.equals("love")){
                count++;
            }

            }
        System.out.println(count);
        }
}
