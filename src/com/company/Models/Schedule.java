package com.company.Models;

import java.sql.Time;

public class Schedule {
    private Weekday weekday;
    private String time;
    private Classroom classroom;
    private Subject subject;

    public Schedule(Weekday weekday, String time, Classroom classroom, Subject subject) {
        this.weekday = weekday;
        this.time = time;
        this.classroom = classroom;
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
