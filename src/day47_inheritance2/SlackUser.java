package day47_inheritance2;

public class SlackUser {
    String name;
    String status;

    public void  sendMessage(String msg){
        System.out.println("SlackUser " + name + " is typing...");

    }
    public void callSomeone(){
        System.out.println("SlackUser " + name + " is calling...");
    }
    public void addEmoji(String emoji){
        System.out.println("SlackUser" + name + " adding emoji" );
    }

}

