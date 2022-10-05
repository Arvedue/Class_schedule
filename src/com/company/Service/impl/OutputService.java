package com.company.Service.impl;

import com.company.Models.Classroom;
import com.company.Models.Schedule;
import com.company.Models.Subject;
import com.company.Models.Weekday;

import java.util.List;

public class OutputService {

    public void printAllObjects(List<Classroom> classrooms, List<Subject> subjects, List<String> times) {
        System.out.println("\n=====Classrooms=====");
        for(Classroom classroom : classrooms) {
            System.out.println("Classroom number: " + classroom.getId());
        }

        System.out.println("\n=====Subjects=====");
        System.out.println("Name \t\t\tmaxHoursPerDay \tHoursPerWeek \tTeacher");
        for(Subject subject : subjects) {
            System.out.println(subject.getName() + "\t\t" + subject.getMaxHoursPerDay() +
                    "\t\t\t\t" + subject.getHoursPerWeek() + "\t\t\t\t" + subject.getTeacher().getName() + " " +
                    subject.getTeacher().getSurname());
        }
    }

    public void printSchedule(List<Classroom> classrooms, List<Subject> subjects, List<String> times) {
        ScheduleGeneration scheduleGeneration = new ScheduleGeneration();
        List<Schedule> schedules = scheduleGeneration.generateSchedule(classrooms, subjects, times);
        Weekday[] weekdays = Weekday.values();

        System.out.println("\n=====Schedule=====");

        for (Weekday weekday : weekdays) {
            System.out.println("-----------------");
            System.out.println("\t" + weekday);
            System.out.println("-----------------");

            for (Schedule schedule : schedules) {
                if(weekday.equals(schedule.getWeekday())) {
                    System.out.println(schedule.getTime() + "\t Classroom: " +
                            schedule.getClassroom().getId());
                    System.out.println(schedule.getSubject().getName() + " / " +
                            schedule.getSubject().getTeacher().getName() + " " +
                            schedule.getSubject().getTeacher().getSurname() + "\n");
                }

            }
        }
    }
}
