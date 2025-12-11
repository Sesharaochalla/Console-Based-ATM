**🏧 Console-Based ATM**

A simple, console-based ATM simulation written in Java.
This project demonstrates core object-oriented programming concepts such as classes, inheritance, interfaces, method overriding, and encapsulation.

**📌 Features**

🔐 User Authentication (PIN-based login)

💰 Check Balance

💵 Deposit Money

🏧 Withdraw Money

📜 Transaction Summary (optional depending on your implementation)

🧩 Modular structure using multiple Java classes

🧱 Demonstrates OOP concepts (Inheritance, Abstraction, Polymorphism)

**📂 Project Structure**
Console-Based-ATM/
│
├── ATMApp.java
├── ATMFunctions.java
├── BaseATM.java
├── Main.java
├── SimpleATM.java
└── User.java

**🔍 File Descriptions**
File	Description
Main.java	Entry point of the program; runs the ATM application.
ATMApp.java	Handles the main workflow of the ATM system.
ATMFunctions.java	Interface containing ATM operation method signatures.
BaseATM.java	Parent class implementing common ATM functionalities.
SimpleATM.java	A specific ATM implementation extending BaseATM.
User.java	Represents a user with account details and PIN.
**▶️ How to Run**
1. Clone this repository
git clone https://github.com/your-username/Console-Based-ATM.git
cd Console-Based-ATM

2. Compile the Java files
javac *.java

3. Run the program
java Main
