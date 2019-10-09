package by.pvt.epam.task2;

import java.util.Arrays;
import java.util.Comparator;

public class TrainService {

    public void sortArrayByDestination (Train[] array) {
        Arrays.sort(array, Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
    }

    public void sortArrayByTrainNumb (Train[] array) {
        Arrays.sort(array, Comparator.comparing(Train::getTrainNumber));
    }

}
