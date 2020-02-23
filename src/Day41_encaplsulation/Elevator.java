package Day41_encaplsulation;

public class Elevator {
   private int currentFloor;

    public void gotoFloor(int newFloor) {
        //check if newFloor is out of Range
        if (newFloor < 0 || newFloor > 6){
            System.out.println("ERROR: Wrong floor selected: " + newFloor);
        return;// exit method
    }
        if(newFloor > currentFloor){
            for (int i = currentFloor+1; i <= newFloor ; i++) {
                System.out.println("going up to floor " + i);
            }

        }else if(newFloor < currentFloor){
            for (int i = currentFloor-1; i >= newFloor; i--) {
                System.out.println("Going down a Floor " + i);

            }
        }else{
            System.out.println("Already On floor");
        }
        currentFloor=newFloor;
       // while (currentFloor != newFloor){

        }
    }

