package day46_inheritance_Intro;

public class DeviceTest {
    public static void main(String[] args) {
        Device device = new Device();
        device.brand = "LG";
        device.price = 900;
        device.country = "South Korea";
        device.use();

        TV tv = new TV();
        tv.brand = "Sony";
        tv.price = 800;
        tv.country = "Japan";
        tv.screenSize = 66;
        tv.isSmart = true;

        tv.watch();

        Phone phone = new Phone();
        phone.brand = "Apple iPhone";
        phone.price = 912.99;
        phone.country = "China";
        phone.carrier = "Sprint";

        phone.use();
        phone.call();
        phone.text("Java is fun");


        SmartPhone smartPhone = new SmartPhone();
        smartPhone.brand = "Samsung Galaxy Note 10";
        smartPhone.price = 899.0;
        smartPhone.country = "South Korea";
        smartPhone.carrier = "Verizon";
        smartPhone.memorySize = 128;


        smartPhone.use();
        smartPhone.call();
        smartPhone.text("Inheritance is fun");
        smartPhone.useApp("Slack");

    }
}
