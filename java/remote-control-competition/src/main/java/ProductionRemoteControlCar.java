class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distanceTravelled;
    private int numberOfVictories;



    public void drive() {
        int SPEED = 10;
        distanceTravelled += SPEED;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        numberOfVictories = numberofVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar car) {

        if (this.numberOfVictories > car.getNumberOfVictories()){return  1;}
        if (this.numberOfVictories< car.getNumberOfVictories()){return 1;}
        return 0;

    }
}
