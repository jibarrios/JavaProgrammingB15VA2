package day22_arrays_intro;

public class ArraysWithNumbers {
    public static void main(String[] args) {
        int[] numsArrays = new int[5];
        numsArrays[0] = 123;
        numsArrays[1] = 345;
        numsArrays[2] = 33;
        numsArrays[3] = 10;
        numsArrays[4] = numsArrays[0] + numsArrays[1]; //468
        //  0   1   2   3   4    5
        int[] numsArray2 = {44, 12, 44, 66, 55, 88};
        // declare & assign values in same statement using new keyword
        int[] numsArray3 = new int[]{33, 55, 6, 1, 42, 54, 900, 324};

        //declre 3 int variables & assign values & assign values
        int n1 = 23;
        int n2 = 45;
        int n3 = 10;

        int[] numsArray4 = {n1, n2, n3, 4};

        // print size of each array
        //numArray = 5
        System.out.println("NumsArrays: " + numsArrays.length);
        System.out.println("NumsArray2: " + numsArray2.length);
        System.out.println("NumsArray3: " + numsArray3.length);
        System.out.println("NumsArray4: " + numsArray4.length);

        System.out.println(numsArrays[0]);
        int j = 0;
        System.out.println(numsArrays[j]);
        // print last one
        int l1 = numsArrays.length;
        System.out.println(numsArrays[l1 - 1]);

        System.out.println(numsArrays[numsArrays.length - 1]);
        // print all number using a for loops
        for (int i = 0; i < numsArrays.length; i++) {
            System.out.print(numsArrays[i] + " , ");

        }


        System.out.println();
        //print the numbers if it is more than 100

        for (int n = 0; n < numsArrays.length; n++) {
            if (numsArrays[n] > 100) {
                System.out.print(numsArrays[n] + " | ");
            }
        }
        System.out.println();
        //print array items in reverse in same line
        for (int i =numsArrays.length -1; i >= 0 ; i--) {
            System.out.print(numsArrays[i] + " | ");


        }
    }
}
