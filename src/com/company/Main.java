package com.company;

import com.company.Models.Classroom;
import com.company.Models.Subject;
import com.company.Service.ObjectsGeneration;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ObjectsGeneration objectsGeneration = new ObjectsGeneration();
        List<Classroom> classrooms = objectsGeneration.getClassrooms();
        List<Subject> subjects = objectsGeneration.getSubjects();

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
}
