package by.pvt.epam.task2;



import java.time.Month;
import java.util.Calendar;

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
}
