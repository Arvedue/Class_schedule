package com.company.Service;

import com.company.Models.Classroom;
import com.company.Models.Schedule;
import com.company.Models.Subject;
import com.company.Models.Weekday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScheduleGeneration {

    public List<Schedule> generateSchedule(List<Classroom> classrooms, List<Subject> subjects, List<String> times) {
        Weekday[] weekdays = Weekday.values();
        List<Schedule> schedules = new ArrayList<>();

        int hoursPerWeek = 0;

        for (Weekday weekday : weekdays) {
            List<Subject> usedSubjects = new ArrayList<>();
            List<Classroom> usedClassroom = new ArrayList<>();
            List<String> usedTime = new ArrayList<>();

            Collections.shuffle(classrooms);
            Collections.shuffle(subjects);

            for (String time : times) {
                if (!usedTime.contains(time)) {

                    for (Classroom classroom : classrooms) {
                        if (!usedClassroom.contains(classroom)) {

                            for(Subject subject : subjects) {
                                if(!usedSubjects.contains(subject)) {
                                    if (subject.getHoursPerWeek() >= 1) {
                                        Schedule schedule = new Schedule(weekday, time, classroom, subject);
                                        schedules.add(schedule);
                                        usedSubjects.add(subject);

                                        hoursPerWeek = subject.getHoursPerWeek() - 1;
                                        subject.setHoursPerWeek(hoursPerWeek);
                                        break;
                                    }
                                }
                            }

                            usedClassroom.add(classroom);
                            break;
                        }
                    }

                    usedTime.add(time);
                }
            }
        }

        return schedules;
    }
}
