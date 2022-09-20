package com.company.Service;

import com.company.Models.Classroom;
import com.company.Models.Schedule;
import com.company.Models.Subject;
import com.company.Models.Weekday;

import java.util.List;

public class OutputService {

    ObjectsGeneration objectsGeneration = new ObjectsGeneration();
    List<Classroom> classrooms = objectsGeneration.getClassrooms();
    List<Subject> subjects = objectsGeneration.getSubjects();
    List<String> times = objectsGeneration.getSubjectTime();

    public void printAllObjects() {
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

    public void printSchedule() {
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
                    System.out.println(schedule.getTime() + "\t Room number: " +
                            schedule.getClassroom().getId());
                    System.out.println(schedule.getSubject().getName() + " / " +
                            schedule.getSubject().getTeacher().getName() + " " +
                            schedule.getSubject().getTeacher().getSurname() + "\n");
                }

            }
        }

    }
}
