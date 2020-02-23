package day17_while_do_While_loop;

public class MonkeyLoop {
    public static void main(String[] args) {
        int littleMonkeys = 5;
        while (littleMonkeys >= 1) {
            if (littleMonkeys == 1) {
                System.out.println(littleMonkeys + " little monkey jumping on the bed,");
            }else {
                System.out.println(littleMonkeys + " little monkeys jumping on the bed,");
            }
                littleMonkeys--;
                System.out.println("one fell down and bumped his head,");
                System.out.println("mama called the doctor and the doctor said,");
                System.out.println("No More Monkeys Jumping on the bed!");
                System.out.println();
            }
            System.out.println("put those monkeys right to bed");
        }
    }

