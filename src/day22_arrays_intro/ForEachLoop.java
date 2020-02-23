package day22_arrays_intro;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] nums = {5, 6, 11, 725, 90};
        double [] prices = {19.99, 23.5, 9.99, 5.99, 102.5};
        for(int n : nums){
                System.out.print(n + " ");
        }
        System.out.println();
        for(double price : prices){
            System.out.print(price + " ");
        }



    }
}
