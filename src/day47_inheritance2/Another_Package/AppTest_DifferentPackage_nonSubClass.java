package day47_inheritance2.Another_Package;

import day47_inheritance2.App;

public class AppTest_DifferentPackage_nonSubClass {
    public static void main(String[] args) {
        App app = new App();
        app.name = "Day One";
//        app.developer = "Bloom Built Inc";
 //Protected! Not visible to NON-SubCLass in different
        //Package
//        app.system ="iOS";
//
//        app.price = 0.0;
    }
}
