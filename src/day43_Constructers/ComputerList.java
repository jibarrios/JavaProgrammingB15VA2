package day43_Constructers;

import java.util.*;
public class ComputerList {
    public static void main(String[] args) {
        List <Computer> compList = new ArrayList<>();
        compList.add(new Computer("HP 14", "win10", 219.99));
        Computer c = new Computer("Dell inspiron","win11", 419.99);
            compList.add(c);

            compList.add(new Computer("Sony Vio", "win12", 819.99));
        compList.add(new Computer("HP 25", "Win7", 729.99));
        compList.add(new Computer("MacbookPro 13", "MacOs Catalina", 1819.99));
        compList.add(new Computer("Lenovo 44", "Win11", 2019.99));

        //TASK 1. Print number of computer
        System.out.println("Number of computers: " + compList.size());

        //task 2. Print number of computer brand & price
        System.out.println("----Task 2 -- First Computer----");
        System.out.println(compList.get(0).getBrand());
        System.out.println(compList.get(0).getPrice());

        Computer firstComp = compList.get(0);
        System.out.println(firstComp.getBrand());
        System.out.println(firstComp.getPrice());

        System.out.println("------TASK 3 ---- TOSTRING FOR ALL COMPUTERS--");
        for (int i = 0; i < compList.size(); i++) {
            System.out.println(i + 1 + "." + compList.get(i).toString());


        }
        System.out.println(" -----TASK 4 --- TOSTRING FOR ALL COMPUTER");
        int counter =1;
        for (Computer each:compList) {
            System.out.println(counter+". "+each);
            counter++;

        }
        //TASK 5. Print Brand & Price for computers w/in your Budget
        double myBudget = 800.00;
        for(Computer eachcomp : compList){
            if(eachcomp.getPrice()>= myBudget){
                System.out.println(eachcomp.getBrand() +" | " + eachcomp.getPrice());
            }

            for (int i = 0; i < compList.size() ; i++) {

                if(compList.get(i).getPrice()<= myBudget){
                    System.out.println(compList.get(i).getBrand()+ " | " + compList.get(i).getPrice());
                }

            }
            //Task 6. calculate Total price for all computers

            //task 7. Print info of most expensive computer

            //task 8. Print info of least expensive computer

            //task 9. 50 % off for all computers then Print toString for all of them


        }


        }

    }


