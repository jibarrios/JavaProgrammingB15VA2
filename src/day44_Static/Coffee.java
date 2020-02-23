package day44_Static;

public class Coffee {
    private String name;
    private String size;
    //tall, grande, venti
    private double price;

    public Coffee(String name, String size, double price) {
        this.name = name;
        this.setSize(size);// this bring the conditions that was set in setSize
        // So we don't have to repeat our self (The condition)
        //only if its states the same parameters
        this.price = price;
    }
    public Coffee(){
        this.name = "undecided";
        this.size = "not Sure";
        this.price = 0.0;

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size.equals("tall") || size.equals("grande") || size.equals("Venti")) {
            this.size = size;
        }else{
            System.out.println("ERROR: Invalid size - " + size);
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void drink(){
        System.out.println("Drinking " + size + " " + name + " for $" + price);
    }
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}

