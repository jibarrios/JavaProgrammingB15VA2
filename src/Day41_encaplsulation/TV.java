package Day41_encaplsulation;

public class TV {
    String brand;
    String powerState;
    int channel;

    public void turnOn(){
        if(powerState.equals("off")) {
            System.out.println("INFO: Turning ON  " + brand + "TV");
            powerState = "on";
        }
    }

        public void turnOff(){
            //if it is ON, then Turn OFF
            if(powerState.equals("on")){
                System.out.println("INFO: Turning OFF " + brand +" TV");
                powerState = "off";

        }

        }
    //instance methods/behaviour:
//    - setTVInfo()
//	- turnOn
//	- turnOff
//	- setChannel(newChannel)
//	- toString
    public void setChannel(int newChannel){
        System.out.println("INFO: Changing channel...");
        channel= newChannel;
    }
    public void channelUp(){
        System.out.println("INFO: next Channel...");
        channel++;
    }
    public void channelDown(){
        channel--;
    }

    public void setTVInfo(String pBrand, String pPowerState, int pChannel){
        System.out.println("INFO: setting TV information..");
        brand = pBrand;
        powerState = pPowerState;
        channel = pChannel;
    }
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", powerState='" + powerState + '\'' +
                ", channel=" + channel +
                '}';
    }
}
