package Repl_it;

public class TV {
    private int channel = 1;
    private int volumeLevel = 1;
    boolean on = false;
    private String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args-constructors");
    }

    public TV(String brand) {
        System.out.println("Creating TV object using 1 args-constructors");
        this.brand = brand;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel >= 1 && volumeLevel <= 7) {
            this.volumeLevel = volumeLevel;
        } else {
            System.out.println("ERROR: TV is either OFF or inValid Volume Level");
        }
    }

    public void setChannel(int channel) {
        if (channel > 0 && channel <= 120) {
            this.channel = channel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public int getChannel() {
        return channel;
    }

    public String getBrand() {
        return brand;
    }

    public void volumeUP() {
        setVolumeLevel(getVolumeLevel() + 1);

    }

    public void volumeDown() {
        setVolumeLevel(getVolumeLevel() - 1);
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        if (on == false) {
            on = true;
        } else {
            System.out.println("TV is already ON");
        }
    }
        public void turnOff(){
            if (on == true) {
                on = false;
            } else {
                System.out.println("TV is already OFF");

            }

        }

    }
