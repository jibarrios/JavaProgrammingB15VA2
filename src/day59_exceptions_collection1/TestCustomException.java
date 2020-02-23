package day59_exceptions_collection1;

public class TestCustomException {
        public static void main(String[] args){
            //throw new InsufficientFundsException();
            double balance = 1000;
            double price = 145.99;
            String itemName = "Shoes";
            if (price > balance) {
                throw new InsufficientFundsException("Not enough funds for this transaction");
            } else {
                balance -= price;
                System.out.println("Transaction successful! Enjoy your new " + itemName);
                System.out.println("Remaining balance: " + balance);
            }

           int time = 1;

            if(time>=1){
            //    throw new LunchTimeException("Break until 2:23");
            }else{
                System.out.println("Keep coding JAVA");
            }
        }}


