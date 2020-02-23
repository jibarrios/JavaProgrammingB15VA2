package day22_arrays_intro;

public class SumOfArray {
    public static void main(String[] args) {
        //double[] prices = new double[6]{
        double [] prices = {34.4, 123.4, 10.5, 4.33, 76.4, 90};
        double totalPrices = 0.0;

        for (double each: prices) {
            totalPrices += each;

        }
        System.out.print("totalPrices: " + totalPrices);
        double moreThan50 = 0.0;

        System.out.println();
        for (double j : prices){
            if(j>50){
                moreThan50 += j;

            }
        }
        System.out.print("Number more than 50 = " + moreThan50);
        // loop through each item & if u find price more than 100
        //print "item too expensive, you dont need that"
        // exit the loop
        System.out.println();
        for(double price : prices){
            if(price > 100){
                System.out.println(price + " item is too expensive, you don't need that");
                break;
            }
        }
    }
}
