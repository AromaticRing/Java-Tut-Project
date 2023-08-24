import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasswordManager {
    private static final int PASSWORD_LENGTH = 12;
    private static final String ALLOWED_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> usernamePasswordMap = new HashMap<>();

        while (true) {
            System.out.println("1. Generate Password");
            System.out.println("2. Validate Password");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a username: ");
                    String username = scanner.nextLine();
                    String generatedPassword = generateRandomPassword();
                    usernamePasswordMap.put(username, generatedPassword);
                    System.out.println("Generated password: " + generatedPassword);
                    break;

                case 2:
                    System.out.print("Enter the username: ");
                    String inputUsername = scanner.nextLine();
                    System.out.print("Enter the password: ");
                    String inputPassword = scanner.nextLine();
                    if (validatePassword(usernamePasswordMap, inputUsername, inputPassword)) {
                        System.out.println("Password is valid.");
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    private static String generateRandomPassword() {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);

        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int randomIndex = random.nextInt(ALLOWED_CHARACTERS.length());
            password.append(ALLOWED_CHARACTERS.charAt(randomIndex));
        }

        return password.toString();
    }

    private static boolean validatePassword(Map<String, String> usernamePasswordMap, String username, String password) {
        if (usernamePasswordMap.containsKey(username)) {
            String storedPassword = usernamePasswordMap.get(username);
            return storedPassword.equals(password);
        }
        return false;
    }
}
