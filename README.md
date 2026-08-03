# Loan Application System

## 📌 Project Overview

The **Loan Application System** is a console-based Java application developed to manage the loan application and approval process.

The application allows users to enter applicant details, apply for different types of loans, check loan eligibility, calculate loan-related details, and view the application status. The project demonstrates the use of **Core Java, OOP concepts, Collections, Exception Handling, and conditional logic**.

## 🚀 Features

* Add applicant details
* Apply for a loan
* Select different loan types
* Check loan eligibility
* Calculate eligible loan amount
* Approve or reject loan applications
* View applicant and loan details
* Search applicant details
* Update loan application status
* Input validation
* Exception handling
* Menu-driven console interface

## 🛠️ Technologies Used

* **Language:** Java
* **Concepts:** OOP, Collections, Exception Handling
* **IDE:** Eclipse / IntelliJ IDEA / VS Code
* **JDK:** Java 17

## 🧠 Java Concepts Used

The project demonstrates:

* Classes and Objects
* Encapsulation
* Inheritance
* Polymorphism
* Abstraction
* Constructors
* Methods
* Interfaces
* ArrayList / Collections
* Exception Handling
* Conditional Statements
* Loops
* Scanner for user input

## 🏗️ Project Structure

```text
LoanApplication/
│
├── src/
│   ├── Applicant.java
│   ├── Loan.java
│   ├── LoanApplication.java
│   ├── LoanService.java
│   └── Main.java
│
└── README.md
```

## 🔄 Application Flow

```text
Start Application
       ↓
Display Main Menu
       ↓
Enter Applicant Details
       ↓
Select Loan Type
       ↓
Enter Income & Loan Amount
       ↓
Check Eligibility
       ↓
 ┌───────────────┐
 │   Eligible?   │
 └───────┬───────┘
         │
    ┌────┴────┐
   Yes        No
    ↓          ↓
Approved    Rejected
    ↓          ↓
Display Loan Application Status
```

## 📋 Main Menu

```text
========== LOAN APPLICATION SYSTEM ==========

1. Add Applicant
2. Apply for Loan
3. Check Loan Eligibility
4. View Applicant Details
5. View Loan Details
6. Search Applicant
7. Exit

Enter your choice:
```

## 💰 Loan Eligibility

The system checks applicant information such as:

* Applicant income
* Employment status
* Requested loan amount
* Loan type
* Applicant age
* Existing loan details

Based on the predefined eligibility criteria, the application is either **Approved** or **Rejected**.

## ▶️ How to Run

### Step 1: Clone the Repository

```bash
git clone <your-github-repository-url>
```

### Step 2: Open the Project

Open the project in:

* Eclipse
* IntelliJ IDEA
* VS Code

### Step 3: Compile the Application

```bash
javac *.java
```

### Step 4: Run the Application

```bash
java Main
```

## 🖥️ Sample Output

```text
========== LOAN APPLICATION SYSTEM ==========

1. Add Applicant
2. Apply for Loan
3. Check Loan Eligibility
4. View Applicant Details
5. View Loan Details
6. Exit

Enter your choice: 2

Enter Applicant Name: Jayasree
Enter Age: 24
Enter Monthly Income: 45000
Enter Loan Amount: 500000
Enter Loan Type: Personal Loan

Checking eligibility...

Loan Application Approved!

Application ID: LA1001
Applicant Name: Jayasree
Loan Amount: ₹500000
Status: APPROVED
```

## 🎯 Learning Outcomes

This project helped in understanding:

* Real-world application of Core Java
* Object-Oriented Programming principles
* Designing a menu-driven application
* Implementing business logic
* Working with Java Collections
* Handling invalid user input
* Exception handling
* Developing modular and reusable Java code

## 🔮 Future Enhancements

* Add MySQL database integration using JDBC
* Develop a GUI using JavaFX
* Add user authentication
* Add EMI calculation
* Add credit score-based eligibility
* Generate loan approval reports
* Add an admin module


**Skills:** Java | OOP | Collections | Exception Handling | Problem Solving
