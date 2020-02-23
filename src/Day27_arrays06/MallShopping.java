package Day27_arrays06;

import com.sun.security.jgss.GSSUtil;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"shoes","jacket","gloves","airpods","ipad","iPhone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int [] itemIDs = { 2345, 12346, 1234, 3324, 27783, 90332};
        // TASK 1. Check if all 3 arrays are exact same length

        if(items.length == prices.length && itemIDs.length == items.length){
            System.out.println("All Arrays are equal length. Good to go!");
        }else{
            System.out.println("Error: Array length Mismatch! Quitting the program");
            return;//stops program. exit method
        }
        //task 2. Print how many items purchased
        System.out.println("total items purchased: " + items.length);

        // TASK 3. print a receipt
        /*
        21233 item price
        ...
        total prices:
         */
        double totalPrice = 0.0;
        for (int i = 0; i < items.length; i++) {
            System.out.println(itemIDs[i] + " - " + items[i] + " $" + prices[i]);
            totalPrice +=prices[i];


        }

        totalPrice = totalPrice * 1.06;
        System.out.println("totalPrice = " + (int)totalPrice);

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("airpods")) {
                System.out.println(itemIDs[i] + " - " + items[i] + "  $" + prices[i]);
                break;

            }
        }
              double maxPrice = prices[0];
             int maxPricein = 0;

            for (int j = 0; j < prices.length; j++) {
                if(prices[j] >maxPrice){
                    maxPrice= prices[j];
                    maxPricein= j;

                }
            }
        System.out.println("Most expensive Item: ");
        System.out.println(itemIDs[maxPricein] + " - " + items[maxPricein] + "  $" + prices[maxPricein]);

            }




        }




