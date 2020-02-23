package day16_memory_string_while_loop_intro;

public class StartEnd {
    public static void main(String[] args) {


        String str  = "I love [java] programming";
        //step1 indentity the position of [
        // step 2, identity the position of ]
        //step 3, use Start step1 & step2 as start, end inputs tp
        // substring variable

        System.out.println(str.substring(8,12));

        int start = str.indexOf("[");
        int end = str.indexOf("[");
        System.out.println(str.substring(start+1, end));



    }
}
