package by.pvt.epam.task2;

import java.util.Arrays;
import java.util.Comparator;

public class TrainService {

    public void printArrayByDestination(Train[] array) {
        sortArrayByDestination(array);
        System.out.println(Arrays.toString(array));
    }

    public void printArrayByTrainNum(Train[] array) {
        sortArrayByTrainNumb(array);
        System.out.println(Arrays.toString(array));
    }

    private void sortArrayByDestination (Train[] array) {
        Arrays.sort(array, Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
    }

    private void sortArrayByTrainNumb (Train[] array) {
        Arrays.sort(array, Comparator.comparing(Train::getTrainNumber));
    }

}
