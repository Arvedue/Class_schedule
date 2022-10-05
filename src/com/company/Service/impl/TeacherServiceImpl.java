package com.company.Service.impl;

import com.company.Models.Teacher;
import com.company.Service.TeacherService;

import java.util.Scanner;

public class TeacherServiceImpl implements TeacherService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public Teacher createTeacher() {
        System.out.println("Enter teacher id: ");
        int id = scanner.nextInt();
        System.out.println("Enter teacher name: ");
        String name = scanner.next();
        System.out.println("Enter teacher surname: ");
        String surname = scanner.next();

        System.out.println("New Teacher was added!");
        return new Teacher(id, name, surname);
    }
}
