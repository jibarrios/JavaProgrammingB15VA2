package day31_Multidarrays_Methods;

public class ValidDate {
    public static void main(String[] args) {
        int[] date = {4,30,2019};
        int month = date[0];
        int day   = date[1];
        int year  = date[2];
        //check for any invalid month, day, year
        if( (month <= 0 || month > 12) || (day <= 0 || day > 31) || (year <= 0) ){
            System.out.println("Invalid date");
        }else{
            /*
            31 -> 1,3,5,7,8,10,12
            30 -> 4, 6, 9, 11
            28-29 -> 2
            */
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("Valid date");
                    break;
                case 4: case 6: case 9: case 11:
                    if(day == 31){
                        System.out.println("Invalid date");
                    }else{
                        System.out.println("Valid date");
                    }
                    break;
                case 2:
                    //TODO: Check february based on leap year
                    if( day > 29){
                        System.out.println("Invalid date");
                    }else{
                        System.out.println("Valid date");
                    }
                    break;
            }
        }
    }
}
