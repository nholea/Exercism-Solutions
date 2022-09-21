public class CarsAssemble {
    int CAR_PRODUCED_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        return CAR_PRODUCED_PER_HOUR * speed * successRate(speed);
    }


    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }

    private static double successRate(int speed) {
        if (speed >= 1 && speed < 5) {
            return 1.;
        } else if (speed >= 5 && speed < 9) {
            return 0.9;
        } else if (speed < 10) {
            return 0.8;
        } else {
            return 0.77;
        }
    }
}
