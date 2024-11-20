# Student Management System

A **Java-based console application** for managing student records. This project demonstrates basic **CRUD operations**, **data filtering**, **sorting**, and **calculations** using Java's Object-Oriented Programming principles, **Streams API**, and **Collections Framework**.

---

## Features

1. **Add Student**  
   Add a new student by providing their ID, name, gender, and marks.
   
2. **Display Students**  
   View a list of all registered students with their details.

3. **Filter Students by Marks**  
   Display students who scored above a specified marks threshold.

4. **Sort Students by Name**  
   Display students sorted alphabetically by their names.

5. **Sort Students by Marks**  
   Display students sorted by marks in descending order.

6. **Calculate Average Marks**  
   Calculate and display the average marks of all students.

7. **Exit**  
   Safely exit the application.

---

## Project Structure

```
src/
├── com.project/
│   ├── Main.java           # Main entry point of the application
│   ├── Student.java        # Student class with attributes and methods
│   └── StudentService.java # Service class for managing student operations
```

---

## Technologies Used

- **Java**: Core Java features including Streams API and Collections Framework.
- **Java 1.8 or higher**: Required for running the project.
- **IDE**: Any Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse).

---

## How to Run

### Prerequisites:
- Ensure **Java Development Kit (JDK)** version 8 or above is installed on your system.
- Set up an IDE or use the command line for running the project.

### Steps:
1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/student-management-system.git
   ```
2. Navigate to the project directory:
   ```bash
   cd student-management-system
   ```
3. Compile the project:
   ```bash
   javac -d bin src/com/project/*.java
   ```
4. Run the application:
   ```bash
   java -cp bin com.project.Main
   ```

---

## Sample Output

```
Student Management System
1. Add Student
2. Display Students
3. Filter Students by Marks
4. Sort Students by Name
5. Sort Students by Marks
6. Calculate Average Marks
7. Exit
Enter your choice: 1
Enter ID: 101
Enter Name: John Doe
Enter Gender: Male
Enter Marks: 85
Student added successfully!
```

---

## Contributions

Contributions are welcome! Feel free to fork the repository and submit pull requests.

### Steps to Contribute:
1. Fork the project.
2. Create a new branch:
   ```bash
   git checkout -b feature-branch
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your feature"
   ```
4. Push to your branch:
   ```bash
   git push origin feature-branch
   ```
5. Submit a pull request.

---


Happy Coding! 😊
