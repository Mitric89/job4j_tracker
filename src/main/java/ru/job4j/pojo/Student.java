package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fullName;
    private String group;
    private LocalDate dateOfEntrance;

    public LocalDate getDateOfEntrance() {
        return dateOfEntrance;
    }

    public void setDateOfEntrance(int year, int month, int dayOfMonth) {
        this.dateOfEntrance = LocalDate.of(year, month, dayOfMonth);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
