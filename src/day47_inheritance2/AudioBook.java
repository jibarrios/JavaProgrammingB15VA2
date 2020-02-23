package day47_inheritance2;

public class AudioBook extends ClassBook{
    private double length;
    private String narrator;
    //Listening to audioBook Written bu jackie Chan w/ Java 8 in action
    //Narrated by maria

    public void listen (){
        System.out.println("Listening to Audio book written by " + getAuthor() + ", With title "
                + getTitle() + ", Narrated by " + getNarrator());
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
}
