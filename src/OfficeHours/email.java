package OfficeHours;

public class email {
    String receiver; //null
    String cc;
    String subject;
    String body;
    String signature = ""; //null by default
    String date;
    String folderName;
    boolean attachments;
    public void setReceiver(String email){
        folderName = "Draft";
        if (email.contains("@")) { //first.last@domain.com
            if (email.substring(email.indexOf("@")).contains(".")) {
                receiver = email;
            } else {
                System.out.println("Invalid domain extention. Please enter valid email");
            }
        } else {
            System.out.println("Email is not vaild. Please enter valid email");
        }
        //we can add do while with scanner to prompt the user to enter different email
    }
    public void setCc(String email){
        if (email.contains("@")) { //first.last@domain.com
            if (email.substring(email.indexOf("@")).contains(".")) {
                cc = email;
            } else {
                System.out.println("Invalid domain extention. Please enter valid email");
            }
        } else {
            System.out.println("Email is not vaild. Please enter valid email");
        }
    }
    public void setSubject (String subject_value){
        subject = subject_value;
    }
    public void setBody (String body_value){
        body = body_value +"\n"+ signature;
    }
    public void setSignature (String signature_value){
        signature = signature_value;
    }
    public void setDate(String date_value){
        date = date_value;
    }
    public void setAttachments(boolean attachments_value){
        attachments = attachments_value;
    }
    public void getEmailInfo(){
        System.out.println("To: " + receiver + "\n"+
                "cc: " + cc + "\n"+
                "subject: " + subject + "\n"+
                body+ "\n"+
                "Attachments: " + attachments + "\n"+
                "folderName" + folderName + "\n"+
                "date: " + date);
    }
}
