import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase13PalindromeCheckerApp {

    // Stack-based palindrome
    private static boolean stackPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) stack.push(c);
        for (char c : normalized.toCharArray()) {
            if (stack.pop() != c) return false;
        }
        return true;
    }

    // Deque-based palindrome
    private static boolean dequePalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : normalized.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Two-pointer palindrome
    private static boolean twoPointerPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Stack approach timing
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long endStack = System.nanoTime();

        // Deque approach timing
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long endDeque = System.nanoTime();

        // Two-pointer timing
        long startTwo = System.nanoTime();
        boolean twoResult = twoPointerPalindrome(input);
        long endTwo = System.nanoTime();

        System.out.println("\nResults:");

        System.out.printf("Stack: %b, Time: %d ns%n", stackResult, (endStack - startStack));
        System.out.printf("Deque: %b, Time: %d ns%n", dequeResult, (endDeque - startDeque));
        System.out.printf("Two-Pointer: %b, Time: %d ns%n", twoResult, (endTwo - startTwo));

        scanner.close();
    }
}