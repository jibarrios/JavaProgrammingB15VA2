package Day40_Custom_Classes;

public class CarGurus {
    public static void main(String[] args) {
        Car acura = new Car();
        acura.model = "Acura ILX";
        acura.price= 28150.0;
        acura.color = "White";
        acura.year = 2020;

        System.out.println("acura model: " + acura.model);
        acura.drive();
        acura.showPrice();

        //Another car Object
        Car bmw = new Car();
        bmw.model = "Bmw 5 series";
        bmw.price= 51115.0;
        bmw.color = "Black";
        bmw.year = 2019;


        bmw.drive();
        bmw.showPrice();

        Car porsche = new Car();
        porsche.setCarInfo("911 Carrera S", 127753,"Sliver", 2020);
        porsche.drive();
        porsche.showPrice();


        Car toyota = new Car();
        toyota.setCarInfo("Toyota Prius",
                          21452.0,
                          "Grey",
                           2019);
        System.out.println(toyota.model);
        System.out.println(toyota.price);
        System.out.println(toyota.color);
        System.out.println(toyota.year);


        acura.getCarInfo();
        bmw.getCarInfo();
        porsche.getCarInfo();


        //compare prices & porsche and print which is more exp
        if(bmw.price>porsche.price){
            System.out.println("BMW is more expensive");

        }else{
            System.out.println("Porsche is more expensive");
        }


    }
}
