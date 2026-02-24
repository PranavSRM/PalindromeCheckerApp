/**
 MAIN CLASS - UseCase RecursivePalindrome
 Use Case : Recursive Palindrome Checker
 Description
 This class validates a palindrome using recursion.
 Characters are compared from the outer positions
 moving inward using recursive calls.
 The recursion stops when:
 All characters are watched, or
 A mismatch is found.
 This use case demonstrates divide-and-conquer
 logic using method recursion.

 @author PranavSRM
 @version 9.0
 **/
import java .util.*;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Palindrome Checker App ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Strengthening core concepts: Using recursion for validation
        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is NOT a palindrome.");
        }
        scanner.close();
    }

    /**
     * UC9: Recursive Palindrome Checker
     * Goal: Check palindrome using recursion.
     */
    public static boolean isPalindrome(String s) {
        // Base Condition 1: An empty string or single character is a palindrome
        if (s.length() <= 1) {
            return true;
        }

        // Recursive Step: Compare start & end characters [Flow Step 1]
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            // Recursive call with smaller subproblem (the middle substring)
            return isPalindrome(s.substring(1, s.length() - 1));
        }

        // Base Condition 2: Characters don't match, not a palindrome [Flow Step 2]
        return false;
    }
}