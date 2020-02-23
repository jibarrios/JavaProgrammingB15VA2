package day05_Practices_ScannerInput;

public class SalaryCalculator {
    public static void main(String[] args){
        double hourlyRate = 40.0;
        double  weeklySalary = hourlyRate * 40;
        double monthlySalary = weeklySalary *  52 / 12;
        double annualSalary = monthlySalary * 12;
        // there would be a error is variable is not declared
        /*Ex) apple = 3
        int total= apple + cookies
         cookies =2 */

        System.out.println("Your weekly Salary is $" + weeklySalary);
        System.out.println("Your monthly Salary is $" + monthlySalary);
        System.out.println("Your annual Salary is $" + annualSalary);








    }
}
