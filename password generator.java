import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();

        System.out.println("Include numbers? (yes/no): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.println("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

        System.out.println("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.println("Include special characters? (yes/no): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("yes");

        scanner.close();

        // Define character sets
        String numbers = "0123456789";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        // Create a StringBuilder to construct the password
        StringBuilder password = new StringBuilder();

        // Populate the character pool based on user specifications
        String charPool = "";
        if (includeNumbers) {
            charPool += numbers;
        }
        if (includeLowercase) {
            charPool += lowercaseLetters;
        }
        if (includeUppercase) {
            charPool += uppercaseLetters;
        }
        if (includeSpecialChars) {
            charPool += specialChars;
        }

        // Generate the random password
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charPool.length());
            password.append(charPool.charAt(randomIndex));
        }

        // Display the generated password
        System.out.println("Your generated password is: " + password.toString());
    }
}
