class NeedForSpeed {
    private int speed;
    private int batteryDrain;

    private int distanceDriven = 0;

    private int batteryLevel = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryLevel < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
        distanceDriven += speed;
        batteryLevel -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
       NeedForSpeed needForSpeedCar = new NeedForSpeed(50,4);
       return needForSpeedCar;
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()){car.drive();}
        return distance<= car.distanceDriven();
    }
}
