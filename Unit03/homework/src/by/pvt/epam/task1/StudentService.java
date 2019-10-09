package by.pvt.epam.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentService {

    public List<Student> getExcellentStudentsList(Student[] array) {

        List<Student> excellentList = new ArrayList<>();

        Arrays.stream(array)
                .filter(n ->
                        n.getProfress().length == Arrays.stream(n.getProfress()).filter(t -> t >= 9).count())
                /* Проходим по всему массиву студентов и сравниваем у каждого студента длину общего
                массива оценок с длинной массива отсортированных по правилу t >= 9 оценок */
                .forEach(excellentList::add);

        return excellentList;
    }
}
