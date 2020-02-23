package day15_string_manipulation;

import org.w3c.dom.ls.LSOutput;

public class StringIndexOf {
    public static void main(String[] args) {
        String technologies = "java, c++,python,tomcat,aws";
        System.out.println(technologies.indexOf("c++")); //6
        System.out.println(technologies.indexOf("java"));
        int java, c, python, aws, tomcat;
        // first declare variables
        java= technologies.indexOf("");
        c=  technologies.indexOf("c++");
        python = technologies.indexOf("python");
        aws = technologies.indexOf("aws");
        python = technologies.indexOf("python");
        tomcat = technologies.indexOf("tomcat");
        int html = technologies.indexOf("html");

        System.out.println("java = "+ java);
        System.out.println("c = " + c);
        System.out.println("python = " +python);
        System.out.println("tomcat = " + tomcat);
        System.out.println("aw = " +aws);
        System.out.println("html =" + html );
//technologies --> how can we check if c++ is in techologies String
//contains
        //indexOf(result > -1

        if(technologies.contains("c++")) {
            System.out.println("c++ is present");
        }else{
            System.out.println("c++ is not present ");

        }
        if(technologies.indexOf("c++") > -1) {
            System.out.println("c++ is there");
        }else {
            System.out.println("c++ is not there");










    }

    }
}
