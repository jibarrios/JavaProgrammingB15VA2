package day43_Constructers;

import java.util.Arrays;

class ComputerObjects {
     public static void main(String[] args) {
         //create a computer using NO-Args constructor
         Computer dell = new Computer();
         //create a computer using 3 args constructor
         Computer hp = new Computer("HP Pavilion", "Windows 10 Pro", 1400);
         //Array for String object
         String[] names = new String[3];
         //System.out.println(names[0].toUpperCase());
         names[0] = "java";
         names[1] = "simba";
         names[2] = new String("calamba");
         //Array for Computers
         Computer[] compArray = new Computer[3];
         //shorter, directly use new keyword to assign object to array index
         compArray[0] = new Computer("HP 14-DK0002DX", "Win10", 219.99);
         //longer, first create object then assign to array index
         Computer dellInsp = new Computer("Dell Inspiron", "Win11", 349.99);
         compArray[1] = dellInsp;
         compArray[2] = new Computer("Macbook Pro 16in", "MacOS Catalina", 2599.99);
         //Call toString methods for all 3 computers
         System.out.println(compArray[0].toString());
         System.out.println(compArray[1].toString());
         System.out.println(compArray[2].toString());
         System.out.println(Arrays.toString(compArray));

     }
     }
