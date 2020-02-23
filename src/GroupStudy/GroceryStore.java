package GroupStudy;

public class GroceryStore {
   private  String fruit;
   private String color;
   private double price;



    public GroceryStore( String color, String fruit, double price) {
        this.fruit = fruit;
        this.color = color;
        this.price = price;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "GroceryStore{" +
                "fruit='" + fruit + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

