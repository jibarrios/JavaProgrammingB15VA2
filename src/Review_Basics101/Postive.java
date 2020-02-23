package Review_Basics101;

public class Postive {
    public static void main(String[] args) {
        String item = "Hello Arman Birmagambetov";
        String str1 = item.replace((" "), "").toLowerCase();
        String str2 = "";
        for(int i = item.length()-1; i >= 0; i--){
            str2+=item.charAt(i);
        }
        System.out.println(str2);

        String[] str3 = item.split(" ");
        for(int i = str3.length-1; i >= 0; i--){
            System.out.print(str3[i]+" ");
        }
        System.out.println();
        for(int i =str1.length()-1; i >= 0; i--){
            System.out.print(str1.charAt(i));
        }






    }
}
