package Day40_Custom_Classes;

public class BankAccountTest {
    public static void main(String[] args) {
    //create an account
    CheckingAccount clientOne= new CheckingAccount();
    //set data
    clientOne.accountNumber=343253634;
    clientOne.accountHolder="Adam Smith";
    clientOne.balance=500000.0;
        clientOne.getAccoiuntInfo();
        System.out.println(clientOne.accountNumber);
    //call getAccountInfo
        clientOne.getAccoiuntInfo();
    //create another account and set data using a method
    CheckingAccount clientTwo=new CheckingAccount();
        clientTwo.setInfo(20000.0, 4352352, "Juliza");
        clientTwo.getAccoiuntInfo();
    //test deposit method
        System.out.println();
        clientOne.deposite(300);
        clientOne.getAccoiuntInfo();
        System.out.println();
        clientTwo.deposite(1000);
        clientTwo.getAccoiuntInfo();
        System.out.println();
        clientOne.withDraw(10000);
        clientOne.getAccoiuntInfo();
        System.out.println();
        clientTwo.withDraw(1000000);
        clientTwo.getAccoiuntInfo();


        CheckingAccount myAccount = new CheckingAccount();
        myAccount.setInfo(200,2221114444L,"Ivette Barrios");

        myAccount.purchase("book",98);
        System.out.println("current Balance: " + myAccount.balance);
        myAccount.purchase("shoes", 120.0);
        myAccount.purchase("tires", 450);


        System.out.println("coded lots of Java, and landed a SDET job");
        System.out.println("First month salary is direct deposited");

        myAccount.deposite(1000);
        myAccount.getAccoiuntInfo();



    }


}
