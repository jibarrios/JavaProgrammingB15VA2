package day52_Interface;

public class WhatsApp extends MessagingApp implements VoiceCallable,VideoCallable{

    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp - sending a message - " + msg + "...");
    }

    @Override
    public void call(String contact) {
        System.out.println("Whats App - calling " + contact + "...");
    }

    @Override
    public void accept() {

    }

    @Override
    public void VideoCall() {

    }
}