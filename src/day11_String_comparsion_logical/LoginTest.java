package day11_String_comparsion_logical;

public class LoginTest {
    public static void main(String[] args) {
        String userName = "cbtuser";
        String password = "abc123";

    if(userName.equalsIgnoreCase("cbtuser") && password.equals("abc123")){
        System.out.println("Login Successful, Welcome");
        }else if(userName.equalsIgnoreCase("cbtuser") && !password.equals("abc123")){
        System.out.println("Invalid Password, Try again");
    }else if(!userName.equalsIgnoreCase("cbtuser") && password.equals("abc123")){
        System.out.println("Invalid Username, Try again");
    }else if(!userName.equalsIgnoreCase("cbtuser") && !password.equals("abc123")){
        System.out.println("Invalid Username and Invalid Password, Try again!");
    }
    }
}
