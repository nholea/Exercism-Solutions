public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int actualMinutes){
        return expectedMinutesInOven() - actualMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layerNumbers){
        return layerNumbers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int layerNumbers, int minutesInOven){
        return minutesInOven + preparationTimeInMinutes(layerNumbers);

    }
}
