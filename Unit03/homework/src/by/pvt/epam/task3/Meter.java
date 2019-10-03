package by.pvt.epam.task3;

public class Meter {

    private int currValue;
    private int minValue;
    private int maxValue;

    public Meter (int minValue, int maxValue, int currValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.currValue = currValue;
    }

    public Meter() {
        minValue = 0;
        maxValue = 10;
        currValue = 5;
    }

    public void increaseValue() {
        currValue++;
        if(currValue > maxValue) {
            currValue = minValue;
        }
    }

    public void decreaseValue() {
        currValue--;
        if (currValue < minValue) {
            currValue = maxValue;
        }
    }

    public void printCurrentValue() {
        System.out.println("Current Value: " + currValue);
    }

    @Override
    public String toString() {
        return "Meter with minValue = " + minValue +
                " maxValue = " + maxValue + " and currentValue = " + currValue;
    }
}
