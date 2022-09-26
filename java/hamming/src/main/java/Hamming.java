import java.util.Arrays;

public class Hamming {
    private final String leftStrand;
    private final String rightStrand;
    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() > rightStrand.length() && rightStrand.length()!=0) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        if (rightStrand.length() > leftStrand.length() && leftStrand.length() !=0){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        if (rightStrand.length() == 0 && leftStrand.length() !=0){
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() == 0 && rightStrand.length() !=0){
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        this.rightStrand = rightStrand;
        this.leftStrand = leftStrand;
    }

    public int getHammingDistance() {
        int counter = 0;

        for (int index = 0; index < rightStrand.length(); index++) {
            if (rightStrand.charAt(index) != leftStrand.charAt(index)) {
                counter++;
            }
        }
        return counter;
    }
}
