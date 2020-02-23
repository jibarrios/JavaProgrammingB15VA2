package day43_Constructers;

public class OurPets {
    public static void main(String[] args) {
        Pets shrek = new Pets();
        shrek.setType("dog");
        shrek.setName("Shrek");
        System.out.println(shrek.toString());
        System.out.println(shrek.gettype());
        System.out.println(shrek.getName());
        Pets mimi = new Pets();
        mimi.petPetInfo("mimi","cat");
        System.out.println(mimi.toString());
        System.out.println(mimi);


    }
}


