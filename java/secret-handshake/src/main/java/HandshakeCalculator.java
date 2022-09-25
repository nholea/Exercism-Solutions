import java.util.*;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> expectedSecretHandshake = new ArrayList<>();
        String numberToBinary = Integer.toBinaryString(number);
        int lengthBinaryNumber = numberToBinary.length();
        checkCharacterPosition(expectedSecretHandshake, numberToBinary, lengthBinaryNumber);

        return expectedSecretHandshake;
    }

    private static void checkCharacterPosition(List<Signal> expectedSecretHandshake, String numberToBinary, int lengthBinaryNumber) {
        if (lengthBinaryNumber >= 1 && numberToBinary.charAt(lengthBinaryNumber -1) == '1') {
            expectedSecretHandshake.add(Signal.WINK);
        }
        if (lengthBinaryNumber >= 2 && numberToBinary.charAt(lengthBinaryNumber -2) == '1') {
            expectedSecretHandshake.add(Signal.DOUBLE_BLINK);
        }

        if (lengthBinaryNumber >= 3 && numberToBinary.charAt(lengthBinaryNumber -3) == '1') {
            expectedSecretHandshake.add(Signal.CLOSE_YOUR_EYES);
        }

        if (lengthBinaryNumber >= 4 && numberToBinary.charAt(lengthBinaryNumber -4) == '1') {
            expectedSecretHandshake.add(Signal.JUMP);
        }
        if (lengthBinaryNumber >= 5 && numberToBinary.charAt(lengthBinaryNumber -5) == '1') {
            Collections.reverse(expectedSecretHandshake);
        }
    }


}
