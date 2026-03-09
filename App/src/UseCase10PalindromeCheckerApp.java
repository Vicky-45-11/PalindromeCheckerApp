import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string: remove spaces and convert to lower case
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The given string is a Palindrome (case & space ignored).");
        } else {
            System.out.println("The given string is NOT a Palindrome (case & space ignored).");
        }

        scanner.close();
    }
}