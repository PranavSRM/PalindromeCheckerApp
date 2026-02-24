/**
MAIN CLASS - UseCase6Palindrome Checker App
Use Case 6: Queue Stack Fairness Check
Description:
This class demonstrates palindrome validation using
        two different data structures:
Queue (FIFO First In First Out)
- Stack (LIFO Last In First Out)
Characters are inserted into both structures and then compared by removing from the front of the queue and the top of the stack.
If all characters match, the input string is confirmed as a palindrome.
This use case helps understand how FIFO and LIFO behaviors can be combined for symmetric comparison.
@author PranavSRM
@version 6.0
**/
import java .util.*;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Normalize: lowercase and remove non-alphanumeric characters
        String cleanStr = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // 1. Enqueue and Push characters
        for (int i = 0; i < cleanStr.length(); i++) {
            char c = cleanStr.charAt(i);
            stack.push(c);  // LIFO
            queue.add(c);   // FIFO
        }

        // 2. Compare dequeue vs pop
        while (!queue.isEmpty()) {
            // Dequeue removes first char, Pop removes last char added
            if (!queue.remove().equals(stack.pop())) {
                return false; // Mismatch found
            }
        }

        return true; // All characters matched
    }
}