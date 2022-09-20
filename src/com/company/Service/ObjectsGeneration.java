package com.company.Service;

import com.company.Models.Classroom;
import com.company.Models.Subject;
import com.company.Models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class ObjectsGeneration {

    public List<Classroom> getClassrooms() {
        List<Classroom> classrooms = new ArrayList<>();

        Classroom classroom1 = new Classroom(101);
        Classroom classroom2 = new Classroom(102);
        Classroom classroom3 = new Classroom(103);
        Classroom classroom4 = new Classroom(104);
        Classroom classroom5 = new Classroom(105);

        classrooms.add(classroom1);
        classrooms.add(classroom2);
        classrooms.add(classroom3);
        classrooms.add(classroom4);
        classrooms.add(classroom5);

        return classrooms;
    }

    public List<Subject> getSubjects() {
        Teacher teacher1 = new Teacher(1, "Bekzhan", "Chandaev");
        Teacher teacher2 = new Teacher(2, "Adis", "Kerimov");
        Teacher teacher3 = new Teacher(3, "Aigerim", "Budaichieva");
        Teacher teacher4 = new Teacher(4, "Alaken", "Kubatbekov");
        Teacher teacher5 = new Teacher(5, "Kubanychbek", "Kushtarbekov");

        List<Subject> subjects = new ArrayList<>();
        Subject subject1 = new Subject(1, "Mathematics", 1, 5, teacher1);
        Subject subject2 = new Subject(2, "Informatics", 1, 4, teacher2);
        Subject subject3 = new Subject(3, "Programming", 1, 5, teacher5);
        Subject subject4 = new Subject(4, "Algorithms", 1, 3, teacher4);
        Subject subject5 = new Subject(5, "Philosophy", 1, 2, teacher3);

        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        subjects.add(subject4);
        subjects.add(subject5);

        return subjects;
    }

    public List<String> getSubjectTime() {
        List<String> times = new ArrayList<>();
        times.add("8:00");
        times.add("9:30");
        times.add("11:00");
        times.add("12:30");
        times.add("14:00");

        return times;
    }

}
