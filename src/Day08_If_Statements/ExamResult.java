package Day08_If_Statements;

public class ExamResult {
    public static void main(String[] args){
        int score = 55; // you named variable

        if(score >= 60) {// you just named the variable now your questioning it
            System.out.println("Congratulations, you pass the exam");
        }else{
            System.out.println("You failed");
            System.out.println("Please study more and try again. Don't be sad");
        }
    }
}
