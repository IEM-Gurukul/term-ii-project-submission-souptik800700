# PCCCS495 – Term II Project

## Project Title

Password Strength Checker Using Object-Oriented Design

---

## Problem Statement 

Weak passwords are one of the primary causes of security vulnerabilities in modern systems. Many users create simple or predictable passwords without following security best practices, making them susceptible to brute-force attacks and unauthorized access. Existing systems often lack real-time feedback to guide users in creating stronger passwords.
This project aims to address this issue by developing a password strength checker that evaluates passwords based on multiple security rules such as length, character variety, and complexity. The system provides immediate feedback and suggestions, helping users improve their password quality and enhance overall security.

---

## Target User

General users, students, and individuals creating passwords for online platforms who need guidance in choosing secure passwords

---

## Core Features

* Password validation based on multiple security rules
* Checks for length, uppercase, lowercase, numbers, and special characters
* Strength classification (Very Weak, Weak, Medium, Strong)
* Suggestions for improving weak passwords
* Input validation and error handling

---

## OOP Concepts Used

* Abstraction: Implemented using an abstract `Rule` class that defines common validation behavior
* Inheritance: Specific rule classes (LengthRule, NumberRule, etc.) extend the `Rule` class
* Polymorphism: The `validate()` method behaves differently for each rule class
* Exception Handling: Handles invalid inputs such as empty or null passwords
* Collections / Threads: Uses `ArrayList` to store and apply validation rules dynamically

---

## Proposed Architecture Description

The system follows a modular object-oriented architecture where responsibilities are clearly separated.
The `Main` class handles user interaction, while the `StrengthChecker` class manages the core logic of password evaluation. Validation rules are implemented as separate classes derived from an abstract `Rule` class, enabling extensibility and clean design. All rules are stored in a collection and executed dynamically. The `Result` class encapsulates the final output, including password strength and improvement suggestions. This design ensures scalability, maintainability, and ease of adding new rules.

---

## How to Run

1. Navigate to the `src` folder
2. Compile the program:

   ```
   javac PasswordStrengthChecker/main/Main.java
   ```
3. Run the program:

   ```
   java PasswordStrengthChecker.main.Main
   ```
4. Enter a password to check its strength

---

## Git Discipline Notes

This project follows proper version control practices with multiple meaningful commits showing incremental development. Each commit reflects a specific improvement such as project setup, implementation of core logic, feature enhancements, and final refinements. The commit history demonstrates a structured development approach rather than a single bulk upload.
