package com.project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    // Add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students
    public void displayStudents() {
        students.forEach(System.out::println);
    }

    // Filter students by marks
    public void filterByMarks(int threshold) {
        List<Student> filtered = students.stream()
                                         .filter(student -> student.getMarks() > threshold)
                                         .toList(); // Replaces .collect(Collectors.toList())
        filtered.forEach(System.out::println);
    }

    // Sort students by name
    public void sortByName() {
        students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
    }

    // Sort students by marks
    public void sortByMarks() {
        students.stream()
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .forEach(System.out::println);
    }

    // Calculate average marks
    public void calculateAverageMarks() {
        double average = students.stream()
                                 .mapToInt(Student::getMarks)
                                 .average()
                                 .orElse(0.0);
        System.out.println("Average Marks: " + average);
    }
}
