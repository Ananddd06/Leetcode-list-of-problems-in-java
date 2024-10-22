package codingPart;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProblemManager problemManager = new ProblemManager();
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);

        // User Authentication (login or register)
        if (!authenticateUser(userManager, scanner)) {
            System.out.println("Exiting .......");
            return;
        }

        // Main problem menu loop
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View all problems");
            System.out.println("2. View problems by category");
            System.out.println("3. Get a random problem");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    displayAllProblems(problemManager);
                    break;
                case 2:
                    System.out.println("Enter a category (e.g., Arrays, Strings, Linked Lists, Stacks): ");
                    String category = scanner.nextLine();
                    displayProblemsByCategory(problemManager, category);
                    break;
                case 3:
                    displayRandomProblem(problemManager);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // User authentication process
    public static boolean authenticateUser(UserManager userManager, Scanner scanner) {
        System.out.println("Welcome! Please choose an option:");
        System.out.println("1. Register");
        System.out.println("2. Login");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            return handleRegister(userManager, scanner);
        } else if (choice == 2) {
            return handleLogin(userManager, scanner);
        } else {
            System.out.println("Invalid choice.");
            return false;
        }
    }

    // User registration handler
    public static boolean handleRegister(UserManager userManager, Scanner scanner) {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (userManager.register(username, password)) {
            System.out.println("Registration successful! Please login.");
            return handleLogin(userManager, scanner);
        } else {
            System.out.println("Username already exists. Try a different username.");
            return false;
        }
    }

    // User login handler
    public static boolean handleLogin(UserManager userManager, Scanner scanner) {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (userManager.login(username, password)) {
            System.out.println("Login successful! Welcome, " + username + "!");
            return true;
        } else {
            System.out.println("Invalid credentials. Please try again.");
            return false;
        }
    }

    // Display all problems
    private static void displayAllProblems(ProblemManager problemManager) {
        List<Problem> problems = problemManager.getAllProblems();
        if (problems.isEmpty()) {
            System.out.println("No problems available.");
        } else {
            System.out.println("\nLeetCode Top Problems:");
            for (Problem problem : problems) {
                System.out.println(problem.getId() + ". " + problem.getTitle() + " (" + problem.getCategory() + " - "
                        + problem.getDifficulty() + ")");
                System.out.println("Link: " + problem.getLink());
            }
        }
    }

    // Display problems by category
    private static void displayProblemsByCategory(ProblemManager problemManager, String category) {
        List<Problem> problems = problemManager.getProblemsByCategory(category);
        if (problems.isEmpty()) {
            System.out.println("No problems found for the category: " + category);
        } else {
            System.out.println("\nProblems in category: " + category);
            for (Problem problem : problems) {
                System.out.println(problem.getId() + ". " + problem.getTitle() + " (" + problem.getDifficulty() + ")");
                System.out.println("Link: " + problem.getLink());
            }
        }
    }

    // Display a random problem
    private static void displayRandomProblem(ProblemManager problemManager) {
        Problem randomProblem = problemManager.getRandomProblem();
        System.out.println("\nRandom Problem:");
        System.out.println(randomProblem.getId() + ". " + randomProblem.getTitle() + " (" + randomProblem.getCategory()
                + " - " + randomProblem.getDifficulty() + ")");
        System.out.println("Link: " + randomProblem.getLink());
    }
}
