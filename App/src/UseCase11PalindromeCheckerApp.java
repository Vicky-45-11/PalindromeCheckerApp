import java.util.Scanner;

// PalindromeChecker class encapsulates the logic
class PalindromeChecker {

    private String input;

    // Constructor
    public PalindromeChecker(String input) {
        this.input = input;
    }

    // Method to check if string is a palindrome
    public boolean checkPalindrome() {
        if (input == null || input.isEmpty()) return true;

        // Normalize string: remove spaces and lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(input);

        // Use the class method to check palindrome
        if (checker.checkPalindrome()) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}