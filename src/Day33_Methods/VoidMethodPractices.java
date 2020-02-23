package Day33_Methods;

import day32_custommethods.EstySearch;



public class VoidMethodPractices {
    public static void main(String[] args) {
        printDay(1);
        printDay(2);
        printDay(3);

        String company;
        buildEmail("Juliza barrios", "apple");

    }
    /*
    Method  name: buildEmail
    input/ params/args: String name, String company
    -remove spaces from name and company
    -String email -> name@company.com
    print email
     */


    public static void buildEmail(String name, String company) {
        name = name.replace(" ", "");
        company = company.replace(" ", "");
        String email = name.toLowerCase() + "@" + company.toLowerCase() + ".com";
        System.out.println(email);

    }
  public static void printDay(int day) {

      switch (day) {
          case 1:
              System.out.println("Monday");
              break;
          case 2:
              System.out.println("Tuesday");
              break;
          case 3:
              System.out.println("Wednesday");
              break;
          case 4:
              System.out.println("Thursday");
              break;
          case 5:
              System.out.println("Friday");
              break;
          case 6:
              System.out.println("Saturday");
              break;
          case 7:
              System.out.println("Sunday");
              break;
      }
  }
      public static void checkEligible(int creditScore){
        if(creditScore >= 640) {
            System.out.println("You are eligible for this loan");
        }else{
            System.out.println("Sorry You are not eligible for this loan");

      /*
    Name: checkEligible
    Input: int creditScore
    if creditScore >= 640
        "You are eligible for this loan"
    else
        "Sorry, you are not eligible for this loan"
     */



      }

              }
  }