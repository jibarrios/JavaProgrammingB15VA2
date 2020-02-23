package OfficeHours;

public class EmailTest {
    /*
           OOP
                Class vs Object
           Class - template/blueprint
           Object is the instance of the Class
           Class is represented by:
                properties/fields/attributes - instant variables
                behaviour/action/functions - methods
           Encapsulation
           Inheritance
           Abstraction
           Polimorphism
     */
    public static void main(String[] args) {
        email email1 = new email();
        email1.setReceiver("f.l@dreamwork.com");
        email1.setCc("John.Menta@dreamwork.com");
        email1.setSubject("Subject of email");
        email1.setSignature(" George Pollock \n SDET in Dreamwork Inc");
        email1.setDate("01-14-2020");
        email1.setBody("Everything we want to say");
        email1.setAttachments(false);
        email1.getEmailInfo();
    }
}

