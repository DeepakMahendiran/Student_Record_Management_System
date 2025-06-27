# Student_Record_Management_System
# 📘 Student Record Manager

A **Java console-based application** to manage student records with features like adding, viewing, searching, updating, deleting, and saving to a file.

This project demonstrates strong fundamentals in **Object-Oriented Programming**, **Collections**, and **File Handling** — ideal for learning Java and showcasing it in interviews or portfolios.

---

## 🛠️ Technologies Used

- Java
- OOP (Object-Oriented Programming)
- Collections (`ArrayList`)
- File Handling (using `Scanner`, `PrintWriter`)

---

## 🎯 Features

- 📥 Add a new student
- 📋 View all students
- 🔍 Search student by ID
- ✏️ Update student details
- 🗑️ Delete student
- 💾 Save data to a text file
- 📂 Load data from file on startup

---

## 📂 Folder Structure

StudentRecordManager/
│
├── Student.java # Represents a Student object
├── StudentManager.java # Handles all student operations
└── Main.java # Menu and user interaction

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/DeepakMahendiran/student-record-manager.git
cd student-record-manager

2. Compile and Run the Program
javac *.java
java Main
3. Sample Flow
Enter filename (e.g., students.txt)

Choose operations from menu:
1. Add Student
2. View All Students
3. Search by ID
...
7. Exit

📌 Sample Output
📘 Student Record Manager
1. Add Student
2. View All Students
3. Search Student by ID
4. Update Student
5. Delete Student
6. Save to File
7. Exit

Enter your choice: 1
Enter ID: 101
Enter Name: Deepak
Enter Age: 21
Enter Department: CSE
✅ Student added successfully!

💡 Highlights
Custom class-based object design

File I/O using plain text files

Dynamic list management using ArrayList

Clean modular code, easy to expand
✅ Future Improvements
GUI version using Java Swing/JavaFX

Replace file handling with database (MySQL)

Validation for input values

Unit tests with JUnit

🤝 Contributions
Contributions are welcome! Feel free to fork, suggest features, or raise issues.
📃 License
This project is licensed under the MIT License.
