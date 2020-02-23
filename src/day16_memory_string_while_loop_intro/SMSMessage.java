package day16_memory_string_while_loop_intro;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Juliza barrios], From Number<2024331234>, message:{hey whats up! lets code Java";

        String sender = ""; //
        String fromNumber= "";
        String txt = "";

        System.out.println("index of [ - " +message.indexOf("["));
        System.out.println("index of ] - " +message.indexOf("]"));
        System.out.println(message.substring(8+1,17));// if name changes does complete show
        int startSender = message.indexOf("[")+1;
        int endSender = message.indexOf("]");
        System.out.println(message.substring(startSender,endSender));

        //nested
        System.out.println(message.substring(message.indexOf("[")+1, message.indexOf("]")));



        System.out.println(message.indexOf("<"));
        System.out.println(message.indexOf(">"));
        System.out.println(message.substring(37+1,48));







    }
}
