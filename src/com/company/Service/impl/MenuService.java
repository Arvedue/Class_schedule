package com.company.Service.impl;

import com.company.Models.Classroom;
import com.company.Models.Subject;
import com.company.Models.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuService {

    Scanner scanner = new Scanner(System.in);
    final ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
    final SubjectServiceImpl subjectService = new SubjectServiceImpl();
    final TeacherServiceImpl teacherService = new TeacherServiceImpl();
    final OutputService outputService = new OutputService();

    List<Classroom> classrooms = new ArrayList<>();
    List<Subject> subjects = new ArrayList<>();
    List<String> times = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();

    public void chooseOption(){
        boolean end = true;
        System.out.println("Welcome, dear User!");
        System.out.println("\n========MENU========");
        System.out.println("1. Auto generate all objects" +
                "\n2. Create new Classroom" +
                "\n3. Add new Teacher" +
                "\n4. Add new Subject" +
                "\n5. Add available time for Subject" +
                "\n6. Generate Schedule" +
                "\n7. Show all objects" +
                "\n0. Exit");

        while(end) {
            System.out.println("\nPlease enter number from the menu: ");
            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("===Generate all objects===");
                    generateObjects();
                    break;

                case 2:
                    System.out.println("===Create new Classroom===");
                    classrooms.add(classroomService.createClassroom());
                    break;

                case 3:
                    System.out.println("===Add new Teacher===");
                    teachers.add(teacherService.createTeacher());
                    break;

                case 4:
                    System.out.println("===Add new Subject===");
                    addNewSubject(teachers);
                    break;

                case 5:
                    System.out.println("===Add available time for Subject===");
                    addTime();
                    break;

                case 6:
                    System.out.println("===Generate Schedule===");
                    if(checkList(classrooms, subjects, times)) {
                        outputService.printSchedule(classrooms, subjects, times);
                    }
                    break;

                case 7:
                    System.out.println("===Show all Objects===");
                    if(checkList(classrooms, subjects, times)) {
                        outputService.printAllObjects(classrooms, subjects, times);
                    }
                    break;

                case 0:
                    System.out.println("========END========");
                    end = false;
                    break;
            }
        }
    }

    private boolean checkList(List<Classroom> classrooms, List<Subject> subjects, List<String> times){
        if(!classrooms.isEmpty() && !subjects.isEmpty() && !times.isEmpty()){
            return true;
        }
        else if(classrooms.isEmpty()){
            System.out.println("There is no Classrooms, please create.");
            return false;
        }
        else if(subjects.isEmpty()){
            System.out.println("There is no Subjects, please create.");
            return false;
        }
        else if(times.isEmpty()){
            System.out.println("There is no available Time for Subjects, please create.");
            return false;
        }
        else
            return false;
    }

    private void generateObjects() {
        ObjectsGeneration objectsGeneration = new ObjectsGeneration();

        classrooms = objectsGeneration.getClassrooms();
        subjects = objectsGeneration.getSubjects();
        times = objectsGeneration.getSubjectTime();

        outputService.printAllObjects(classrooms, subjects, times);
    }

    private void addNewSubject(List<Teacher> teachers) {
        Teacher teacher;

        if(!teachers.isEmpty()){
            System.out.println("\tTeacher list");
            for (Teacher t : teachers) {
                System.out.println(t.getId() + ": " + t.getName() + " " + t.getSurname());
            }

            System.out.println("\nPlease choose teacher for this subject. \nEnter teacher's id: ");
            int id = scanner.nextInt();
            teacher = teachers.get(id);

            subjects.add(subjectService.createSubject(teacher));
        }
        else
            System.out.println("The is no teachers for this subject!");
    }

    private void addTime() {
        System.out.println("Please enter available time for Subjects: ");
        String time = scanner.next();

        times.add(time);
    }

}
