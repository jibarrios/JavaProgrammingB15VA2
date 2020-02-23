package day45_Static_2;

public class StaticBlock {
  //static block
    static{
      System.out.println("STATIC BLOCK - BEFORE EVERYTHING ELSE");
  }
  public StaticBlock(){
      System.out.println("CONSTRUCTOR-EVERY TIME OBJECT IS CREATED");
  }
  public static void staticMethod(){
      System.out.println("STATIC METHOD");
  }
  public static class InnerClass{ // Only inner Class can have Static
        public static void  innerClassStaticMethod(){
            System.out.println("Hello from Inner Class!!!");
        }

  }
}
