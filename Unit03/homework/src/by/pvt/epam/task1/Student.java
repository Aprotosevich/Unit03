package by.pvt.epam.task1;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
        успеваемость (массив из пяти элементов).*/

import java.util.Arrays;
import java.util.Objects;

class Student {
    private String name;
    private int groupNum;
    private int[] profress = new int[5];

    public Student(String name, int groupNum) {
        this.name = name;
        this.groupNum = groupNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public int[] getProfress() {
        return profress;
    }

    public void setProfress(int[] profress) {
        this.profress = profress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNum == student.groupNum &&
                Objects.equals(name, student.name) &&
                Arrays.equals(profress, student.profress);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, groupNum);
        result = 31 * result + Arrays.hashCode(profress);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNum=" + groupNum +
                ", profress=" + Arrays.toString(profress) +
                '}';
    }
}
