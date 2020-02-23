package day47_inheritance2;

public class SlackAdminUser extends SlackUser {
    int adminID;


    public void sendAtChannelMessage(String msg){
        System.out.println("SlackAdminUser [" + name + "] [" + adminID + " is sending @channel Msg");
    }
    public void deleteMessage(){
        System.out.println("Slack");
    }
}
