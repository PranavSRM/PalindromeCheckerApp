/**
 MAIN CLASS Use Case 11 - PalindromeCheckerApp
 Use Case 11: Object Oriented Palindrome Service

 Description:
 This class demonstrates palindrome validation using object-oriented design.
 The palindrome logic is encapsulated inside a PalindromeService class.
 This improves:
 -Reusability
 -Readability
 -Separation of concerns

 @author PranavSRM
 @version 10.0
 **/
import java.util.*;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */

    // 1. Create PalindromeChecker class (Encapsulation)
    public static class PalindromeChecker {
        /**
         * UC 11: using encapsulation to split and check
         */

        // 2. Expose checkPalindrome() method
        public boolean checkPalindrome(String text) {
            if (text == null || text.trim().isEmpty()) return false;

            // Internal Data Structure: Stack (as per UC11 requirements)
            Stack<Character> stack = new Stack<>();

            // Clean the string: remove non-alphanumeric and make lowercase
            String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Push all characters onto the stack
            for (char c : clean.toCharArray()) {
                stack.push(c);
            }

            // Build the reversed string by popping from the stack
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }

            // Single Responsibility Principle: Logic is isolated here
            return clean.equals(reversed.toString());
        }
    }

    // Console-based Driver
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("--- Palindrome Checker App ---");
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        if (checker.checkPalindrome(input)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: Not a palindrome.");
        }

        scanner.close();
    }
}
