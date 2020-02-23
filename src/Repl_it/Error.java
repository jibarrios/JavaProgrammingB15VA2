package Repl_it;

public class Error {
    public static void main(String[] args) {

        String log = "<error:atable style=display: none;<tbody>" +
                "<error:btr id=edit_rubric><td coerror:qlspan=4>" +
                "<form id=error:jedit_rubric_form class=edit-rubric" +
                "-formerror:p no-margin-bottom>error:a";
        //Count number of errors.
        //Look for 'error' text inside the log
        //Additionally also print type of error
        int errorCount = 0;
        for (int i = 0; i < log.length()-4 ; i++) {
           // System.out.println(log.substring(i,i+5));
            String temp =log.substring(i,i+5);
            if(temp.equals("error")){
                System.out.println("ERROR FOUND! At Index - " + i);
                errorCount++;
                System.out.println("ERROR TYPE: " + log.charAt(i+6));
            }
        }
        //if errorCount is more than 0.
        // print "FAIL: 6 ERRORS DETECTED IN THE LOG"
        //ELSE print "PASS: NO ERRORS DETECTED IN THE LOG"

        if(errorCount>0) {
            System.out.println("FAIL: " + errorCount + " Error detected in the log");
        }else{
            System.out.println("PASS: NO ERRORS DETECTED");

        }
    }
}
