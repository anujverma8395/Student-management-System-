# 🎓 Student Management System

A Java-based **Student Management System** developed using **Core Java, JDBC, and MySQL**. This project provides a simple and efficient way to manage student records with complete CRUD (Create, Read, Update, Delete) operations.

---

## 📌 Features

- ➕ Add New Student
- ✏️ Update Student Details
- ❌ Delete Student Record
- 🔍 Search Student by ID
- 📋 View All Students
- 🗄️ MySQL Database Integration
- 🔗 JDBC Connectivity
- 💻 Console/Desktop Based Application

---

## 🛠️ Tech Stack

| Technology | Description |
|------------|-------------|
| ☕ Java | Core Java |
| 🗄️ MySQL | Database |
| 🔗 JDBC | Database Connectivity |
| 💻 IDE | VS Code / IntelliJ IDEA / Eclipse |

---

## 📂 Project Structure

```
Student-Management-System/
│
├── src/
│   ├── DBConnection.java
│   ├── Student.java
│   ├── StudentDAO.java
│   ├── StudentDAOImpl.java
│   └── Main.java
│
├── database.sql
├── README.md
└── LICENSE
```

---

## ⚙️ Installation

### 1️⃣ Clone Repository

```bash
git clone https://github.com/anujverma8395/Student-management-System-.git
```

### 2️⃣ Open Project

Open the project in your preferred Java IDE.

### 3️⃣ Create Database

```sql
CREATE DATABASE studentdb;
```

Import the provided SQL file into MySQL.

### 4️⃣ Update Database Credentials

Modify your database connection details inside:

```
DBConnection.java
```

Example:

```java
String url = "jdbc:mysql://localhost:3306/studentdb";
String user = "root";
String password = "your_password";
```

### 5️⃣ Run Project

Run:

```
Main.java
```

---

## 📸 Functionalities

- Add Student
- Update Student
- Delete Student
- Search Student
- Display All Students

---

## 🎯 Learning Outcomes

This project helped me understand:

- Core Java
- JDBC
- MySQL
- Object-Oriented Programming
- CRUD Operations
- Database Connectivity
- Exception Handling

---

## 🚀 Future Improvements

- Java Swing GUI
- Login Authentication
- Export Student Records
- Attendance Module
- Spring Boot Version
- REST API Integration

---

## 👨‍💻 Author

**Anuj Verma**

📧 Email: itsanuj20@gmail.com

🔗 LinkedIn:
https://www.linkedin.com/in/anuj-verma-597b9332b/

💻 GitHub:
https://github.com/anujverma8395

---

## ⭐ Support

If you like this project, don't forget to ⭐ the repository.
