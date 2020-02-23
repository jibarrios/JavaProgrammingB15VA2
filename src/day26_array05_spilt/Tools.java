package day26_array05_spilt;

public class Tools {
    public static void main(String[] args) {
        String [] tools =  new String[6];
        tools[0]= "Java";
        tools[1]= "selenium";
        tools[2]= "git";
        tools[3]= "junit";
        tools[4]= "jenkins";
        tools[5]= "cucumber";


        for(String toolName : tools) {
            if (toolName.equals("Java")) {
                System.out.println(toolName + " --> fun programming language");
            } else if (toolName.equals("selenium")) {
                System.out.println(toolName + " --> test automation");
            } else if (toolName.equals("git")) {
                System.out.println(toolName + " -> version control");
            } else if (toolName.equals("junit")) {
                System.out.println(toolName + " -> testing tool ");
            } else if (toolName.equals("jenkins")) {
                System.out.println(toolName + " -> continious integration");
            } else if (toolName.equals("cucumber")) {
                System.out.println(toolName + " -> BDD style testing");
            }
        }

    }
}
