package Day42_encapsulation;

public class NullValue {
    String inStr; // Automatically assigned to null since there is no variable assigned
    //by default

    public static void main(String[] args) {
        String myString = null;//null causes the variable to point to nothing
        //int num = null;
        // primitives can not be used with null, since they are no objects
        System.out.println(myString);//null
        myString.length();

        //wrapper class variables can be null
        //whenever we create a custom class, & as Non-Primitive instances
        //variable, they are by default will be null


    }
}
