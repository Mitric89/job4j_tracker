package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Ivanov Ivan Ivanovich");
        student1.setGroup("E401");
        student1.setDateOfEntrance(2026, 1, 21);

        System.out.println("Student " + student1.getFullName() + " from the group " + student1.getGroup()
                + " entranced " + student1.getDateOfEntrance());
    }
}
