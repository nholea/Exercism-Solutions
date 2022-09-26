import java.util.Arrays;
import java.util.stream.IntStream;

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
        return (int) IntStream.range(0,rightStrand.length()).filter(index -> leftStrand.charAt(index) != rightStrand.charAt(index)).count();}
}
