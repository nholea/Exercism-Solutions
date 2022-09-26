import java.util.Random;

class DnDCharacter {
    private Random random;
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;

    public DnDCharacter(){
        this.strength =ability();
        this.dexterity =ability();
        this.constitution =ability();
        this.intelligence =ability();
        this.wisdom =ability();
        this.charisma =ability();
    }

    int ability() {
        Random random = new Random();
        return random.ints(4, 1, 7)
                .sorted()
                .skip(1)
                .sum();
    }

    int modifier(int input) {
        return Math.floorDiv(input-10,2);
    }

    int getStrength() {
       return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        int INITIAL_HITPOINTS = 10;

        return INITIAL_HITPOINTS + modifier(constitution);
    }

}
