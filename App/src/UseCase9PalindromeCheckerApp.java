import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // Recursive method to check palindrome
    private static boolean isPalindrome(String str, int start, int end) {
        // Base case: If pointers cross or meet
        if (start >= end) return true;

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}