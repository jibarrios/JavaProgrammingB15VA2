package Day25_Arrays04_split;

public class TimeArrays {
    public static void main(String[] args) {
        //declare 2 arrays
        int[] time1 ={12,45};
        int [] time2 = {16,45};

        //check if time1 & time2 have valid values
        // hours - 0-23 minute - 0-59

        //Assume time1 & time2 have valid data

        if(time1[0] < time2[0]){
            System.out.println("Time1 is earlier "+ time1[0] + " : " + time1[1]);
        }else if(time2[0] < time1[0]){
            System.out.println("Time2 is earlier "+ time2[0] + " : " + time2[1]);
        }else if(time2[1] < time1[1]) {
            System.out.println("Time1 is earlier " + time1[0] + " : " + time1[1]);
        }else if(time2[1] < time1[1]) {
            System.out.println("Time2 is earlier " + time2[0] + " : " + time2[1]);
        }else{
            System.out.println("Time1 and Time2 are same " + time1[0]+":"+time1[1]);
        }

    }
}
