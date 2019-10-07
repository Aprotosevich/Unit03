package by.pvt.epam.task4;

/* Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
        изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых
        значений. В случае недопустимых значений полей поле устанавливается в значение 0. Создать
        методы изменения времени на заданное количество часов, минут и секунд. */

public class Main {
    public static void main(String[] args) {
        MyTime myTime = new MyTime();
        myTime.printTime();

        myTime.waitFor(5,3,78);
        myTime.printTime();

        myTime.setHours(4);
        myTime.printTime();

        myTime.setHours(50);
        myTime.printTime();
    }
}
