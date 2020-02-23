package day21_forloop4_arrayintro;

public class ReadByPortionPractice {
    public static void main(String[] args) {
        String str = "java, github username, javajava, python, automation java tools, java is most popular";
        //print first letter using substring
        System.out.println(str.substring(0,1));//j
        System.out.println(str.substring(1,2));//a
        int idx = 0;                    //0 ,  1
        System.out.println(str.substring(idx, idx+1));//j
        idx++;//1                      // 1 ,  2
        System.out.println(str.substring(idx, idx +1));//a
        //READ 2 LETTERS USING A VARIABLE
        idx=0;                         //0  , 2
        System.out.println(str.substring(idx,idx+2 ));//ja
        idx++;                         //1,   3
        System.out.println(str.substring(idx, idx+2));//av
        //READ 3 LETTERS USING A VARIABLE:
        idx=0;                          //0,  3
        System.out.println(str.substring(idx, idx+3));//jav
        //READ 1 at a time using for loop and substring
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i, i+1));
        }
        //READ 2 at a time using for loop and substring
        for (int i = 0; i < str.length()-1; i++) {
            System.out.println(str.substring(i, i+2));
        }
        //READ 3 or more at a time using for loop and substring
        //     0123456789101112
        str = "javajavahub";
        for (int i = 0; i < str.length()-3; i++) {
            String temp = str.substring(i, i+4);
            if(temp.equals("java")) {
                System.out.println("java found! lets code it!");
            }
            //System.out.println(str.substring(i, i+4));
        }
    }
}
