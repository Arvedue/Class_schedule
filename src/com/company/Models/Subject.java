package com.company.Models;

public class Subject {
    private int id;
    private String name;
    private int maxHoursPerDay;
    private int hoursPerWeek;
    private Teacher teacher;

    public Subject(int id, String name, int maxHoursPerDay, int hoursPerWeek, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.maxHoursPerDay = maxHoursPerDay;
        this.hoursPerWeek = hoursPerWeek;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHoursPerDay() {
        return maxHoursPerDay;
    }

    public void setMaxHoursPerDay(int maxHoursPerDay) {
        this.maxHoursPerDay = maxHoursPerDay;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
