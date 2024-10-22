package codingPart;

import java.util.HashMap;

public class UserManager {
    // Store users with username as key and User object as value
    private final HashMap<String, User> users = new HashMap<>();

    // Register a new user
    public boolean register(String username, String password) {
        if (users.containsKey(username)) {
            return false; // Username already exists
        }
        users.put(username, new User(username, password)); // Add new user
        return true;
    }

    // Login an existing user
    public boolean login(String username, String password) {
        User user = users.get(username); // Get user by username
        if (user != null && user.getPassword().equals(password)) {
            return true; // Successful login
        } else {
            return false; // Invalid credentials
        }
    }
}
