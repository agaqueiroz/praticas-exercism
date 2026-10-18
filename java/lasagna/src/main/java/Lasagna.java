public class Lasagna {
    
    private final int EXPECTED_MINUTES_IN_OVEN = 40;
    private final int PREPARATION_TIME = 2;

    /**
     * Give the expected minutes in oven.
     *
     * @return int - the overal expected minutes in oven
     */
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    /**
     * Calculate the remaining minutes in oven.
     * 
     * @param elapsedBakeTime - remaining bake time (in minutes) derived from 'expectedMinutesInOven()'
     * @return int - the total time elapsed (in minutes) spent in oven.
     */
    public int remainingMinutesInOven(int elapsedBakeTime) {
        return this.expectedMinutesInOven() - elapsedBakeTime;
    }

    /**
     * Calculate the preparation time in minutes.
     * 
     * @param numberOfLayers - the number of layers in the lasagna.
     * @return int - the total time elapsed (in minutes) preparing each layer.
     */
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * PREPARATION_TIME;
    }

    /**
     * Calculate the elapsed cooking time.
     * 
     * @param numberOfLayers - the number of layers in the lasagna.
     * @param elapsedBakeTime - time the lasagna has been baking in the oven. 
     * @return int - the total time elapsed (in minutes) preparing and baking.
     */
    public int totalTimeInMinutes(int numberOfLayers, int elapsedBakeTime) {
        return preparationTimeInMinutes(numberOfLayers) + elapsedBakeTime;
    }
}
