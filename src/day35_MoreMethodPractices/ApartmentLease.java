package day35_MoreMethodPractices;

public class ApartmentLease {
    public static void main(String[] args) {
        applyForApartment(569);
        applyForApartment(676);
    }

    public static void quality(){

        System.out.println("Congratulations, your application for apartment is approved!");

    }
    public static void notQuality(){
        System.out.println("Unfortunately, your application for apartment is denied! Bye More Code Java");
    }
    public static void applyForApartment(int creditScore){

        if(creditScore >= 650) {
            quality();
        }else{
            notQuality();

        }
    }
}
