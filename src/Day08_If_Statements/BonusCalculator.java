package Day08_If_Statements;

import com.sun.security.jgss.GSSUtil;

public class BonusCalculator {
    public static void main(String[] args){
        int salary = 1000;
        double sales = 10000.4;
        int bonus = 0;
                if(sales >= 10000.0) {
                    bonus += 500; //bonus = bonus +500
                    salary += bonus;// salary = salary + bonus
                }else{
                    bonus += 50;
                    salary += bonus;
         }// your Total salary is $1500 & bonus $500
        System.out.println("Your total salary is $"+ salary + " and it includes bonus of $" + bonus);

    }
}
