package com.company.Service.impl;

import com.company.Models.Subject;
import com.company.Models.Teacher;
import com.company.Service.SubjectService;

import java.util.Scanner;

public class SubjectServiceImpl implements SubjectService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public Subject createSubject(Teacher teacher) {
        System.out.println("Enter subject id: ");
        int id = scanner.nextInt();
        System.out.println("Enter subject name: ");
        String name = scanner.next();
        System.out.println("How many hours per day would you like to have? : ");
        int maxHoursPerDay = scanner.nextInt();
        System.out.println("How many hours per week would you like to have? : ");
        int hoursPerWeek = scanner.nextInt();

        System.out.println("New Subject was added!");
        return new Subject(id, name, maxHoursPerDay, hoursPerWeek, teacher);
    }
}
