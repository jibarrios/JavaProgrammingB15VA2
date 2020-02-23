package day53_review_poly_intro;

public class MacPro extends AppleDevice implements Codeable {
    String model;

    public void userServer(){
        System.out.println(name + " model " + model+ " - using as application server...");
    }


    @Override
    public void use() {
        System.out.println(name + " model "+ model + " - using graphic design, movies, video gaming...");
    }

    @Override
    public void code() {
        System.out.println(name + " model "+ model + " - coding Java in IntelliJ...");

    }
}
