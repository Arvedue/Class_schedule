package com.company.Models;

public class Schedule {
    private Weekday weekday;
    private Classroom classroom;
    private Subject subject;

    public Schedule(Weekday weekday, Classroom classroom, Subject subject) {
        this.weekday = weekday;
        this.classroom = classroom;
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }
}
