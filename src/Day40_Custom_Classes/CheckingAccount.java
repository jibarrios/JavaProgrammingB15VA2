package Day40_Custom_Classes;

public class CheckingAccount {
    double balance;
    long accountNumber;
    String type = "Checking";
    String accountHolder;

    public void setInfo(double pBalance, long pAccNumber, String pAccHolder) {
        accountHolder = pAccHolder;
        accountNumber = pAccNumber;
        balance = pBalance;
    }

    public void deposite(double amount) {
        System.out.println(" depositing $ " + amount + " to account number: " + accountNumber);
        balance += amount;
    }

    public void withDraw(double amount) {
        System.out.println("withdrawing $ " + amount + " from account number: " + accountNumber);
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println(" error your broke lol");
        }
    }

    public void getAccoiuntInfo() {
        System.out.println("Checking account: $" + balance + "," + accountNumber + "," +
                accountHolder);

    }

    public void purchase(String item, double price) {
        System.out.println("purchasing " + item + " for $" + price);
        if (price <= balance) {
            balance -= price;
        } else {
            System.out.println("InsufficientFundsException - Overdraft fee is applied");
            balance -= (price + 35);
        }
        System.out.println("transaction completed for " + item + ",current balance: " + balance);
    }
}
