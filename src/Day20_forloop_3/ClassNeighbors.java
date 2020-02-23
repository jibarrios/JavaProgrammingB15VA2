package Day20_forloop_3;

public class ClassNeighbors {
    public static void main(String[] args) {
        String str = "jaavaa iis fuun";
        // loop through each character & compare w/ next character.
        //if match print "beeep - a"
        for (int i = 0; i < str.length()-1 ; i++) {
            System.out.println(str.charAt(i)+ "" + str.charAt(i+1)); //(i++)
            if(str.charAt(i) == str.charAt(i+1)){
                System.out.println("Beeep - " + str.charAt(i));
            }

        }
    }
}
