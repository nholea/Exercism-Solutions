import java.util.HashMap;

class Scrabble {
private final String word;

private final HashMap<String,Integer> alphabet = new HashMap<>();

private final String [] LETTERS = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                                                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                                                "U", "V", "W", "X", "Y", "Z"};

private final int[] LETTERS_VALUES= new int[] {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};

    public Scrabble(String word) {
      this.word = word;
    }
public HashMap<String,Integer> map() {
    for (int index = 0; index < LETTERS_VALUES.length; index++) {
        alphabet.put(LETTERS[index], LETTERS_VALUES[index]);
    }
    return alphabet;
}

    int getScore() {
        map();
        int score = 0;
        if (!word.isEmpty()){
        String[] splitWord = word.split("");
        for (String letter: splitWord){
            score+= alphabet.get(letter.toUpperCase());

        }
        return score;}
        return 0;
    }





}
