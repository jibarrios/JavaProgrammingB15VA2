package day30_review;

public class CarInfo {
    public static void main(String[] args) {

        //MINI-Cooper -> MINI *****
        //Infiniti - QX56 -> Infiniti-****
        /*
        1) Split or use SubString, & get make and model
        count # of Chars in model & using loop build that many Stars
         */
        String car = "MINI-Cooper";


        String[] carArray = car.split("-");

        String make = carArray[0];
        String model = carArray[1];

                /*
                2.using Substring, indexOf
                String Make = car.String(0,car.indexOf("-"));
                String model = car.substring(car.indexOf("-")+1);
                 */
        String stars = "";
        for (int i = 1; i < model.length(); i++) {
            stars += "*";

        }
        System.out.println(stars);
        String carModelMAsked = make + "-" + stars;
        System.out.println(carModelMAsked);
    }

}

