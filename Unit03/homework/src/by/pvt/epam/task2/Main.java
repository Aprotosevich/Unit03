package by.pvt.epam.task2;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
        Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов
        массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
        пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми
        пунктами назначения должны быть упорядочены по времени отправления. */

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Train[] array = new Train[5];
        main.fillTrainArray(array);

        System.out.println(Arrays.toString(array));

        //main.sortArrayByTrainNumb(array);
        //main.sortArrayByDestination(array);

        System.out.println(Arrays.toString(array));
    }

    private void sortArrayByDestination (Train[] array) {
        Arrays.sort(array, Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
    }

    private void sortArrayByTrainNumb (Train[] array) {
        Arrays.sort(array, Comparator.comparing(Train::getTrainNumber));
    }

    private void fillTrainArray(Train[] array) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(2019, Calendar.SEPTEMBER, 3);
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        calendar.set(Calendar.MINUTE, 50);
        array[0] = new Train("Moscow", 5, calendar);
        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(2019, Calendar.SEPTEMBER, 3);
        calendar1.set(Calendar.HOUR_OF_DAY, 18);
        calendar1.set(Calendar.MINUTE, 0);
        array[1] = new Train("Paris", 2, calendar1);
        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(2019, Calendar.SEPTEMBER, 3);
        calendar2.set(Calendar.HOUR_OF_DAY, 19);
        calendar2.set(Calendar.MINUTE, 30);
        array[2] = new Train("London", 3, calendar2);
        Calendar calendar3 = new GregorianCalendar();
        calendar3.set(2019, Calendar.SEPTEMBER, 3);
        calendar3.set(Calendar.HOUR_OF_DAY, 21);
        calendar3.set(Calendar.MINUTE, 45);
        array[3] = new Train("Asia", 1, calendar3);
        Calendar calendar4 = new GregorianCalendar();
        calendar4.set(2019, Calendar.SEPTEMBER, 3);
        calendar4.set(Calendar.HOUR_OF_DAY, 18);
        calendar4.set(Calendar.MINUTE, 30);
        array[4] = new Train("Asia", 2, calendar4);
    }
}
