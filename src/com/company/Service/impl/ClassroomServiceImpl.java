package com.company.Service.impl;

import com.company.Models.Classroom;
import com.company.Service.ClassroomService;

import java.util.Scanner;

public class ClassroomServiceImpl implements ClassroomService {

    Scanner scanner = new Scanner(System.in);

    @Override
    public Classroom createClassroom() {
        System.out.println("Enter Classroom number: ");
        int classroomNumber = scanner.nextInt();

        System.out.println("New Classroom was created!");
        return new Classroom(classroomNumber);
    }
}
