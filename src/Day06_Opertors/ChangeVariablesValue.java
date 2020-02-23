package Day06_Opertors;

public class ChangeVariablesValue {
        public static void main(String[] args) {
            int students = 50;
            System.out.println("Students" + students);
            students = students + 10;
            System.out.println("Students" + students);

            students = students - 2;
            System.out.println("Students" + students);

            int b12Students = 3;
            students = students + b12Students;
            System.out.println("Students: " + students);
            System.out.println("B12 Students: " + b12Students);

            double balance = 250.0;
            System.out.println("Balance: " + balance);
            double shoePrice = 75.0;
            balance = balance - shoePrice;
            System.out.println("balance: " + balance);

            double socks = 9.99;
            balance = balance - socks;
            System.out.println("Balance: " + balance);

            double shirtPrice = 77.3 * 2;
            balance = balance - shirtPrice;
            System.out.println("Balance: " + balance);

            double sandwich = 7.99;
            balance = balance - sandwich;
            System.out.println("Balance: " + balance);

            int apples = 10;
            apples = apples + 4;
            //-->14
            apples += 4;
            // this is the same thing as the previous statement
            // a -= 3; subtract a *= 5 multi a /= 5 divison a %= 1 from declare a statement
            // shortcut ^^^^^^
            System.out.println(apples);

            int num = 2;
            num += 5;
            System.out.println(num);

            //also num= num +5 equals 7 (both give same result :)
        }
}
