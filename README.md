# Leetcode-like System Design

This is a simple Java-based system for managing coding problems similar to Leetcode. It provides features like user registration, login, viewing problems by category, and selecting random problems.

## Features
- **User Registration and Login**: Users can register and log in to view problems.
- **Problem List**: Users can view all problems or filter by categories such as Arrays, Strings, Linked Lists, and Stacks.
- **Random Problem Selection**: Users can select a random problem from the list.
- **View by Difficulty**: Problems can also be filtered by difficulty (Easy, Medium, Hard).
- **Direct Problem Links**: Each problem includes a direct link to the corresponding problem on Leetcode.

## Project Structure

├── codingPart
│   ├── Main.java                # Entry point for the application
│   ├── Problem.java              # Problem class representing coding problems
│   ├── ProblemManager.java       # Handles problem-related operations
│   ├── User.java                 # Represents a user with username and password
│   └── UserManager.java          # Manages user registration and login
├── uml.txt                       # UML diagram explanation
├── umlExplanation.png            # UML diagram image
└── README.md                     # This readme file

# How to Run the Project

1. Prerequisites
Java Development Kit (JDK): Make sure you have JDK 8 or higher installed.
Git: Ensure Git is installed if you want to clone the repository.

2. Clone the Repository
Clone the repository using the following command:
  git clone https://github.com/your-username/leetcode-like-system-design.git
  cd leetcode-like-system-design/codingPart

3. Compile the Project
Navigate to the codingPart directory and compile all the Java files using the following command: javac *.java

4. Run the Application
After compilation, go back to the project root and run the Main class:
  cd ..
  java codingPart.Main

5. Usage
Once the application starts, you will be prompted to:

Register or log in.
View problems by category or difficulty.
Get a random problem.
Problem Categories Available

* Arrays
* Strings
* Linked Lists
* Stacks
* Example Problems

1.Two Sum - Arrays (Easy)
2.Longest Substring Without Repeating Characters - Strings (Medium)
3.Valid Parentheses - Stacks (Easy)

UML Diagram
The UML diagram for this system can be found in the umlExplanation.png file.


