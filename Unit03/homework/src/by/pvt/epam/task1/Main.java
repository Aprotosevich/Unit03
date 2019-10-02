package by.pvt.epam.task1;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
        успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
        Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Student[] array = new Student[10];
        main.fillArrayWithStudents(array);

        List<Student> excellentStudentsList = main.getExcellentStudentsList(array);

        main.printStudentsList(excellentStudentsList);
    }

    private void printStudentsList(List<Student> excellentStudentsList) {
        excellentStudentsList.forEach(n ->
                System.out.println("Student name: " + n.getName() + " group name: " + n.getGroupNum()));
    }

    private List<Student> getExcellentStudentsList(Student[] array) {
        List<Student> excellentList = new ArrayList<>();

        Arrays.stream(array)
                .filter(n ->
                        n.getProfress().length == Arrays.stream(n.getProfress()).filter(t -> t >= 9).count())
                /* Проходим по всему массиву студентов и сравниваем у каждого студента длину общего
                массива оценок с длинной массива отсортированных по правилу t >= 9 оценок */
                .forEach(excellentList::add);

        return excellentList;
    }

    private void fillArrayWithStudents (Student[] array) {
        array[0] = new Student("Peter Jackson", 2);
        array[0].setProfress(new int[]{5, 2, 5, 4, 3});
        array[1] = new Student("Peter Parker", 1);
        array[1].setProfress(new int[]{8, 8, 7, 9, 9});
        array[2] = new Student("Margo Robby", 3);
        array[2].setProfress(new int[]{9, 9, 9, 10, 10});
        array[3] = new Student("Mary Jaine", 1);
        array[3].setProfress(new int[]{9, 9, 9, 9, 9});
        array[4] = new Student("Leo Di", 2);
        array[4].setProfress(new int[]{10, 10, 10, 10, 9});
        array[5] = new Student("Michael Sidorov", 2);
        array[5].setProfress(new int[]{6, 7, 7, 8, 9});
        array[6] = new Student("Robert Downee", 2);
        array[6].setProfress(new int[]{7, 7, 7, 7, 7});
        array[7] = new Student("Eagle Sport", 3);
        array[7].setProfress(new int[]{9, 9, 9, 10, 9});
        array[8] = new Student("Michelin Fadt", 3);
        array[8].setProfress(new int[]{10, 9, 8, 4, 3});
        array[9] = new Student("John Dorn", 2);
        array[9].setProfress(new int[]{1, 5, 8, 6, 9});
    }
}
