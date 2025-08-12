package OOPS.properties.interfaces;

public class electricengines implements engine {

    @Override
    public void start() {
        System.out.println("electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("electric engine stop");
    }

    @Override
    public void acc() {
        System.out.println("electric engine acc");

    }
}
