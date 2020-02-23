package OfficeHours;

public class OfficeTest {

    public static void main(String[] args) {
        Office office1 = new Office();
        office1.passEntry = true;
        office1.department = "Customer Solutions";
        office1.setFloor(3);
        office1.setUnitNumber(303);
        Office office2 = new Office("IT", false);
        office2.setUnitNumber(202);
        office2.setFloor(2);
        /*
            check the floor of the office:
            1 - Acompany
            2 - Bcompany
            3 - Ccompany
         */
    }
}


