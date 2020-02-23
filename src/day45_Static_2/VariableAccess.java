package day45_Static_2;

public class VariableAccess {
    int instanceCount = 10;
    static  int staticCount = 15;

    public static void staticMethod(){
        //System.out.println("instanceCount" + instanceCount);

        System.out.println("staticCount " + staticCount);

    }
    public void nonStaticInstanceMethod(){
        System.out.println("instanceCount" + instanceCount);
        System.out.println("staticCount " + staticCount);
    }

    public static void main(String[] args) {
        //Variables calls
        //System.out.println("instanceCount" + instanceCount);
        System.out.println("staticCount " + staticCount);

        //method access
        staticMethod();
        //nonStaticInstanceMethod() -unable to access due to no static in method

        /*
        how to access instance (non- static) variable/method
        first create object using NEW keyword
         */
        VariableAccess vbOnj = new VariableAccess();
        System.out.println("instanceCount" + vbOnj.instanceCount);
        vbOnj.nonStaticInstanceMethod();



    }

}
