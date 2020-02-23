package GroupStudy;

public class NESTedLoop {
    public static void main(String[] args) {
        String str = "jjavaselenium";
        // unique charaters are characters that are shown once.
        String answer = "";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        //When using .length , characters are said to 12 but For index it up to 11 b/c index starts with 0
        // which is why we use -1
        for(int outer = 0; outer < str.length(); outer++){
            int count = 0;
            char temp1 = str.charAt(outer);
            for(int inner = 0; inner < str.length(); inner++){
                char temp2 = str.charAt(inner);
                if(temp1 == temp2){
                    count++;
                }
            }
            if(count ==1){
                answer+=temp1+"";
            }
        }
        System.out.println(answer);

        for(int outer = 0; outer < str.length(); outer++){
            System.out.println(outer+"...outer");
            for(int inner = 0; inner < str.length(); inner++){
                System.out.println(inner+"...inner");
            }
        }
    }
}
