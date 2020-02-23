package day53_review_poly_intro;

public class iphone extends AppleDevice implements Wearable,Codeable{
    String model;

    public void navigate(){
        System.out.println("Iphone - navigating using GoogleMaps app...");
    }
    @Override
    public void use() {
        System.out.println(name +  " model" + model + " - using to call, text, play games, flip grid");
    }

    @Override
    public void code() {
        System.out.println(name +"  model " + model + "- coding java in repl.it coding  ");

    }

    @Override
    public void wear() {
        System.out.println(name+ " model " + model + " - wearing on arm using case.");
    }
}
