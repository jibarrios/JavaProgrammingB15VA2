package Day34_MethodPractice;

public class StringAction {
    public static void main(String[] args) {
    int num = countWords("java is fun");
        System.out.println("num = " + num);

        System.out.println("a in java : "+ countChars("java", 'a'));
        System.out.println("a in java : "+ countChars("java", 'q'));
        System.out.println("@ in'' : '' "+ countChars("java", '@'));


    }
    public static int countWords(String str) { //void is the return type
        if(str.isEmpty()) {
            return 0;
        }else {
            String[] array = str.split(" ");
            return array.length;

        }
        }
        public static int countChars(String words, char ch){
               int count = 0;
            for (int i = 0; i < words.length() ; i++) {
                if(words.charAt(i) == ch){
                    count++;

                }
            }
          return count;
        }
}
