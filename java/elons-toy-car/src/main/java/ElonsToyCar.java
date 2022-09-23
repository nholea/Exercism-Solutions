public class ElonsToyCar {
    private int meters = 0;
    private int percentage = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
       return (percentage == 0) ? "Battery empty": "Battery at "+ percentage +"%";
    }

    public void drive() {
        if (percentage > 0) {
            meters += 20;
            percentage--;
        }

    }
}
