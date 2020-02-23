package OfficeHours;
/*
Class office
private int floor
String Department
private int unit #
boolean passEntry

create Constructor w/ 2 params
    department
    passEntry
    the building that will have all office objects
    have only 3 floors

    Office units can be only 3 digits, cannot be 000 and should start w/ 1,2,3
 */
public class Office {

    private int floor;
    String department;
    private int unitNumber;
    boolean passEntry;
    private String companyName;

    public Office(String department, boolean passEntry){
        //this. - it will point to the instance variable
        this.department = department;
        this.passEntry = passEntry;
    }

    public Office(){}
    public Office(int floor){
        //this. - it will point to the instance variable
        this.floor = floor;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        if (floor>=1 && floor<=3){
            this.floor = floor;
        }else {
            System.out.println("invalid floor: should be from 1 to 3");
        }
    }
    public int getUnitNumber() {
        return unitNumber;
    }
    public void setUnitNumber(int unitNumber) {
        String unit_text = unitNumber+"";
        if (unit_text.length()==3 &&
                (unit_text.startsWith("1")||
                        unit_text.startsWith("2")||
                        unit_text.startsWith("3"))
        ){
            this.unitNumber = unitNumber;
        }else {
            System.out.println("Unit number is invalid.");
        }
    }

    public String toString() {
        return "Office{" +
                "floor=" + floor +
                ", department='" + department + '\'' +
                ", unitNumber=" + unitNumber +
                ", passEntry=" + passEntry +
                '}';
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName() {
        switch (floor){
            case 1:
                this.companyName = "Acompany";
                break;
            case 2:
                this.companyName = "Bcompany";
                break;
            case 3:
                this.companyName = "Ccompany";
                break;
            default:
                System.out.println("Invalid floor");
        }

    }
}