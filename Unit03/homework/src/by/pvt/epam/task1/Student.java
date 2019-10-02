package by.pvt.epam.task1;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
        успеваемость (массив из пяти элементов).*/

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
}
