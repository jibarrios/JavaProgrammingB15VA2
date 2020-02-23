package day47_inheritance2;

public class SlackWorkPlace{
    public static void main(String[] args) {
        SlackUser slackUser = new SlackUser();
        slackUser.name = "Imtiaz";
        slackUser.status = "Coding Java";
        slackUser.sendMessage("Make me admin please");
        slackUser.callSomeone();
        slackUser.addEmoji("Wooden Spoon");

        SlackAdminUser admin = new SlackAdminUser();
        admin.name = "Nadir";
        admin.status = "If nadir did it, you can too!";
        admin.adminID = 12345;
        admin.sendAtChannelMessage("keep coding and Talking");
        admin.deleteMessage();
        admin.sendMessage("Quiz today");
        admin.callSomeone();
        admin.addEmoji(":)");

    }
}
