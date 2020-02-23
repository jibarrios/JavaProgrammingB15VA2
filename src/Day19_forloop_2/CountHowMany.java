package Day19_forloop_2;

public class CountHowMany {
    public static void main(String[] args) {
        String str = "java loops are fun";
        int count = 0;
        char myChar = 'a';
                // loop from first until last letter
        // compare if it is equal myChar
        // if true increase count by 1
        // after loop print "count: 3

        for(int w = 0; w < str.length(); w++){
            //System.out.println(str.charAt(w));
            if(str.charAt(w) == myChar){
                count++;
                System.out.println(myChar + " found at " + w);
            }

        }
        System.out.println("count = " + count);
        System.out.println("There are " + count + "[" + myChar+"]" + "in "+"[" + str +"]");

    }
}
