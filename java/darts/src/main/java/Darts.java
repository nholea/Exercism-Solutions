class Darts {
    private final double xCoordinate;
    private final double yCoordinate;

    private final double OUTER_CIRCLE_RADIUS = 10.0;
    private final double MIDDLE_CIRCLE_RADIUS = 5.0;
    private final double INNER_CIRCLE_RADIUS = 1.0;

    private final int OUTER_CIRCLE_PUNCTUATION = 1;
    private final int MIDDLE_CIRCLE_PUNCTUATION = 5;
    private final int INNER_CIRCLE_PUNCTUATION = 10;


    public Darts(double x, double y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public double radius() {
        return Math.sqrt(xCoordinate * xCoordinate + yCoordinate * yCoordinate);
    }

    int score() {
        if (radius() <= INNER_CIRCLE_RADIUS) {
            return INNER_CIRCLE_PUNCTUATION;

        } else if (radius() > INNER_CIRCLE_RADIUS && radius() <= MIDDLE_CIRCLE_RADIUS) {
            return MIDDLE_CIRCLE_PUNCTUATION;

        } else if (radius() > MIDDLE_CIRCLE_PUNCTUATION && radius() <= OUTER_CIRCLE_RADIUS) {
            return OUTER_CIRCLE_PUNCTUATION;
        }
        return 0;
    }
public static void main(String[] args){
    Darts darts = new Darts(0, 0);
    System.out.println(darts.radius());
}
}
