package com.project;

public class Student {
	private int id;
	private String name;
	private String gender;
	private int marks;

	// Constructor
	public Student(int id, String name, String gender, int marks) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
	}

	// Getters and toString() method
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return String.format("ID: %d, Name: %s, Gender: %s, Marks: %d", id, name, gender, marks);
	}
}
