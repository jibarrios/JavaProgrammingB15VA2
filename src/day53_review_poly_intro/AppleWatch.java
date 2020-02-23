package day53_review_poly_intro;

public class AppleWatch extends AppleDevice implements Wearable {
    int series;
    public void countSteps(){
        System.out.println("Apple watch - counting each step...");
    }

    @Override
    public void use() {
        System.out.println("AppleWatch - using to check time, heartrate, execute ApplePay");
    }

    @Override
    public void wear() {
        System.out.println("AppleWatch- Wear in wrist, neck...");
    }
}
