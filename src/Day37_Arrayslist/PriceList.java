package Day37_Arrayslist;
import java.util.*;
public class PriceList {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>(Arrays.asList(9.99, 5.44,10.99, 2.49, 299.49, 57.5, 123.45));
            // calculate sum all prices
        double sum = 0;
        for (double each : prices){
            sum+= each;

        }
        System.out.println("sum = " + sum);
        
        double sum2 = 0;
        for (int i = 0; i < prices.size(); i++) {
            sum2+=prices.get(i);
            
        }
        System.out.println("sum2 = " + sum2);
        // declare  double arraylist cheap
        //add all the Prices that are less than 20.0
        List<Double> cheap = new ArrayList<>();
        List<Double> expensive = new ArrayList<>();

        for (double eachprices : prices){
            if (eachprices<20.0){
                cheap.add(eachprices);
            }else{
                expensive.add(eachprices);
            }
        }
        System.out.println("cheap = " + cheap);
        System.out.println("expensive = " + expensive);
    }
}
