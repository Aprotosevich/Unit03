package by.pvt.epam.task2;



import java.time.Month;
import java.util.Calendar;
import java.util.Objects;

class Train {
    private String destination;
    private int trainNumber;
    private Calendar departureTime;

    public Train(String destination, int trainNumber, Calendar departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Calendar departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Destination: " + destination + ". " + "Train Number: " + trainNumber
                + ". Departure time: " + departureTime.get(Calendar.HOUR_OF_DAY)
                + ":" + departureTime.get(Calendar.MINUTE) + " "
                + Month.of(departureTime.get(Calendar.MONTH) + 1) + " "
                + departureTime.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber &&
                Objects.equals(destination, train.destination) &&
                Objects.equals(departureTime, train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, trainNumber, departureTime);
    }
}
