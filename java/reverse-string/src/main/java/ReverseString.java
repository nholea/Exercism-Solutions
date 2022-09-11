import java.util.*;
import java.util.stream.Collectors;

class ReverseString {

    String reverse(String inputString) {
        List<String> splitInputString = Arrays.asList(inputString.split(""));
        Collections.reverse(splitInputString);
        return String.join("", splitInputString);
    }
  
}
