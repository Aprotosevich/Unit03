package by.pvt.epam.task4;

/* Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
        изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых
        значений. В случае недопустимых значений полей поле устанавливается в значение 0. Создать
        методы изменения времени на заданное количество часов, минут и секунд. */

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.takeBeatifulPrint());

        time.waitFor(5,3,78);
        System.out.println(time.takeBeatifulPrint());

        time.setHours(4);
        System.out.println(time.takeBeatifulPrint());

        time.setHours(50);
        System.out.println(time.takeBeatifulPrint());
    }
}
