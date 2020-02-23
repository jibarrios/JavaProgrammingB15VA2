package Day14_stringManipulation;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "selenium";

        System.out.println(word.startsWith("s"));
        System.out.println(word.startsWith("selen"));
        System.out.println(word.startsWith("el"));

        System.out.println(word.endsWith("ium"));
        System.out.println(word.endsWith("m"));

        //Mr. --> male
        //Mrs.--> Married women
        //Ms. --> single women
        //Dr. ==> doctor

        String name = "Mrs. amy";

        if(name.startsWith("Mr.")){
            System.out.println("Its a male");
        }else if(name.startsWith("Mrs.")){
            System.out.println("married women");
        }else if(name.startsWith("Ms.")){
            System.out.println("Single Women");
        }else if(name.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if(name.startsWith("Prof.")){
            System.out.println("Professor");
        }
// website google


        String website = "www.google.gov";
        if(website.endsWith(".com")){
            System.out.println("English site");
        }else if(website.endsWith(".edu")){
            System.out.println("college site");
        }else if(website.endsWith(".gov")){
            System.out.println("Government Site");
        }
    }

}
