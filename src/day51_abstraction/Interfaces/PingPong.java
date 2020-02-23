package day51_abstraction.Interfaces;

public class PingPong implements Sport, CampusFriendly{
    // When your trying to extent to interface you
    //use keyword implement

    @Override
    public void practice() {
        System.out.println("ping pong - during class break...");

    }

    @Override
    public void compete(String type) {
        System.out.println("Ping pong competition - " + type);
    }
    @Override
    public void installIndoors() {

    }
}
