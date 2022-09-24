public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int distanceTravelled;

    public void drive() {
        int SPEED = 20;
        distanceTravelled += SPEED;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
