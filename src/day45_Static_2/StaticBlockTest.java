package day45_Static_2;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlock.staticMethod();
        StaticBlock stbOnj = new StaticBlock();
        StaticBlock stbOnj2 = new StaticBlock();

        StaticBlock.InnerClass.innerClassStaticMethod();

    }
}
