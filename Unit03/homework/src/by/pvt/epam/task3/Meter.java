package by.pvt.epam.task3;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Meter with minValue = " + minValue +
                " maxValue = " + maxValue + " and currentValue = " + currValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meter meter = (Meter) o;
        return currValue == meter.currValue &&
                minValue == meter.minValue &&
                maxValue == meter.maxValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currValue, minValue, maxValue);
    }
}
