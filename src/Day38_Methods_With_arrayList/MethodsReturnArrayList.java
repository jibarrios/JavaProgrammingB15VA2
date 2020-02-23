package Day38_Methods_With_arrayList;
import java.util.*;
public class MethodsReturnArrayList {
    public static void main(String[] args) {
        System.out.println(getMonth());
        // call getMonths() & assign return Lis
        List<String>allMonthInYear = getMonth();
        System.out.println("allMonthInYear = " + allMonthInYear);




    }
    public static List<String> getMonth() {
        List<String> allMonth = new ArrayList<>();
        allMonth.add("January");
        allMonth.add("February");
        allMonth.add("March");
        allMonth.add("April");
        allMonth.add("May");
        allMonth.add("June");
        allMonth.add("July");
        allMonth.add("August");
        allMonth.add("September");
        allMonth.add("October");
        allMonth.add("November");
        allMonth.add("December");

        return allMonth;


    }
    public static List<Integer> getIntList(int size){
            List<Integer> numbers = new ArrayList<>();
            for (int n = 0; n < size; n++) {
                numbers.add(n);

            }
            return numbers;
    }
    public static List<Integer> getRandomIntList(int size){
        Random r = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int n = 0; n < size; n++) {
            //numbers.add(r.nextInt(101)

        }
        return numbers;
}
}