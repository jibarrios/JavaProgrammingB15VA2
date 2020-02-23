package Day41_encaplsulation;

public class CyberTekBuilding {
    public static void main(String[] args) {
        Elevator elevator1 = new Elevator();// floor is 0 by default
        elevator1.gotoFloor(3);
        System.out.println("-----------");
        elevator1.gotoFloor(5);
        elevator1.gotoFloor(3);
        System.out.println("============");
        elevator1.gotoFloor(7);

        //elevator1.currentFloor=11;// it would work b/c there is no limitation put or
        // now that is in private there is no access cant be changed unless done
        // in the method

        }

    }

