package com.project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		Scanner scanner = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("\nStudent Management System");
			System.out.println("1. Add Student");
			System.out.println("2. Display Students");
			System.out.println("3. Filter Students by Marks");
			System.out.println("4. Sort Students by Name");
			System.out.println("5. Sort Students by Marks");
			System.out.println("6. Calculate Average Marks");
			System.out.println("7. Exit");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter ID: ");
				int id = scanner.nextInt();
				scanner.nextLine(); // consume newline
				System.out.print("Enter Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Gender: ");
				String gender = scanner.nextLine();
				System.out.print("Enter Marks: ");
				int marks = scanner.nextInt();
				service.addStudent(new Student(id, name, gender, marks));
				break;
			case 2:
				service.displayStudents();
				break;
			case 3:
				System.out.print("Enter Marks Threshold: ");
				int threshold = scanner.nextInt();
				service.filterByMarks(threshold);
				break;
			case 4:
				service.sortByName();
				break;
			case 5:
				service.sortByMarks();
				break;
			case 6:
				service.calculateAverageMarks();
				break;
			case 7:
				System.out.println("Exiting...");
				running = false;
				break;
			default:
				System.out.println("Invalid choice! Try again.");
			}
		}

		scanner.close();
	}
}
