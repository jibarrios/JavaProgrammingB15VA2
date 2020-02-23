package Review_Basics101;

public class OOP_Cars {
    String names;
    String brand;
    private double price;


    public OOP_Cars(String names, String brand, double price) {
        this.names = names;
        this.brand = brand;
        this.price = price;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void special() {
        if (names.equals("GT")) {
            this.price = price * 0.9;
            System.out.println(names + " " + price);

        }

    }
        public String toString () {
            return "OOP_Cars{" +
                    "names='" + names + '\'' +
                    ", brand='" + brand + '\'' +
                    ", price=" + price +
                    '}';
        }
    }











