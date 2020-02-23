package OfficeHours;

public class ExpectionPractices {
    public static void main(String[] args){


        try {
            Thread.sleep(3000);//This is an Expected Exception
        }catch (InterruptedException e) {
        }
        System.out.println("Interrupted Exception is handled" );
        System.out.println("Step 2 ");

        try{
           // System.out.println(9/0); Error = ArithmeticException
            int [] arr = {1,2,4};
            System.out.println(arr[50]);


        }catch (IndexOutOfBoundsException e){ //It need to be the related to the exception
            // if not it would still not compile (ERROR MSG)
            System.out.println("index out of boundException is handled");
            //Since there are more catch it continue and stop when the Exception matches

        }catch (ClassCastException e){
            System.out.println("Class cast exception is handled");
        }catch (ArithmeticException e){
            System.out.println("Class cast exception is handled");
        }catch (IllegalStateException e){
            System.out.println("Illegal state Exception is handled");
        }



        System.out.println("Test Completed");


    }
}

