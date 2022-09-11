import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (getLastWeek().length ==0){
            return 0;
        }
        return getLastWeek()[getLastWeek().length - 1];

    }

    public void incrementTodaysCount() {
        getLastWeek()[getLastWeek().length - 1] += 1;


    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(getLastWeek()).anyMatch(bird ->bird == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(getLastWeek()).limit(numberOfDays).sum();
    }

    public int getBusyDays() {
       return Math.toIntExact(Arrays.stream(getLastWeek()).filter(bird -> bird >=5).count());

    }

    public static void main(String[] args){
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        System.out.println(birdCount.getToday());
// => 1
    }
}
