package day53_review_poly_intro;

import javax.xml.namespace.QName;

public class AppleStore {
    public static void main(String[] args) {
       // AppleDevice appleDevice = new AppleDevice(); Cannot instantiate
        AppleWatch iWatch = new AppleWatch();
        iWatch.name="Apple Watch";
        iWatch.series = 5;
        iWatch.use();
        iWatch.wear();
        iWatch.countSteps();

        iphone myPhone = new iphone();
        myPhone.name = "iPhone";
        myPhone.model = "11 pro";
        myPhone.navigate();
        myPhone.use();
        myPhone.wear();


         MacPro macpro = new MacPro();
         macpro.name = "MacPro ";
         macpro.model = "Cheese Grater";
         macpro.use();
         macpro.code();




    }
}
