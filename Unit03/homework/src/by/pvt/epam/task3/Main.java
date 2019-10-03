package by.pvt.epam.task3;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в
    заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
    Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
    Написать код, демонстрирующий все возможности класса. */

public class Main {
    public static void main(String[] args) {
        Meter meter = new Meter();
        meter.printCurrentValue();
        meter.increaseValue();
        meter.printCurrentValue();

        Meter meter1 = new Meter(10, 100, 10);
        meter1.decreaseValue();
        meter1.decreaseValue();
        System.out.println(meter1);
    }
}
