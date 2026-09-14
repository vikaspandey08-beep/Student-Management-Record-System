# Student-Management-Record-System
A Java based console Application to manage student records.
# 🎓 Student Management System

A console-based Java application designed to take bulk student details as input, validate the data dynamically, and display them in a clean, tabular format. This project demonstrates core Java fundamentals, data validation techniques, and object collection management.

## 🚀 Features & Logic Implemented
- **Bulk Data Entry:** Prompts the user for the total number of students and captures data in a structured loop.
- **Strict Data Validation:**
  - **Identity Check:** Ensures that the *Student ID* and *Student Name* cannot be identical to prevent bad inputs.
  - **Academic Check:** Restricts the *CGPA* input strictly between `0` and `10`, forcing a re-entry if an invalid score is provided.
- **Dynamic Storage:** Utilizes a Java `ArrayList` to dynamically store objects of the student class.
- **Tabular Report Display:** Formats the final output into a beautiful alignment using `System.out.printf`.

## 🛠️ Tech Stack & Key Concepts Used
- **Language:** Java ☕
- **Data Collection:** `java.util.ArrayList`
- **User Input:** `java.util.Scanner`
- **Core Concepts:** Object-Oriented Programming (Constructor & Custom Objects), Conditional Loops, and String Formatted Output.

## 💻 How to Run
1. Clone this repository to your local system.
2. Open your terminal inside this project folder.
3. Run the following command to execute the code:
   ```bash
   java StudentManagement.java
   ```
