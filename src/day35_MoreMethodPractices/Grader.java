package day35_MoreMethodPractices;

public class Grader {
    public static void main(String[] args) {
        System.out.println(getGrade(95));

    }
        public static char getGrade(int score){

//            if (getGrade(53) == 'C'){
//                System.out.println("PASS - C grade returned correctly");
//            }else{
//                System.out.println("FAIL - UnitTest error");
//            }
//            char gradeTest = getGrade(35);//D
//            System.out.println("gradeTest = " + gradeTest);
//            if(gradeTest == 'D'){
//                System.out.println("UNIT TEST PASS");
//            }else{
//                System.out.println("UNIT TEST FAIL");
//            }
//        }
        char grade;
                if(score >=94&&score<=100){
                   grade = 'A';
                }else if(score>=80&&score<=93){
                    grade ='B';
                }else if(score>=50&&score<=79){
                    grade ='C';
                }else if(score>=0&&score<=49){
                    grade ='F';
                }else {
                    System.out.println("Error,Invalid input");
                    grade = '0';

                }
                return grade;

//            if(score>=94&&score<=100){
//                return 'A';
//            }else if(score>=80&&score<=93){
//                return 'B';
//            }else if(score>=50&&score<=79){
//                return 'C';
//            }else if(score>=0&&score<=49){
//                return 'F';
//            }else {
//                System.out.println("Error,Invalid Score " + score);
//                return '0';

            }
            }


