/**
 MAIN CLASS Use Case 10 - PalindromeCheckerApp
 Use Case 10: Normalized Palindrome Validation
 Description:
 This class validates a palindrome after preprocessing
 the input string.

 Normalization includes:
 - Removing spaces and symbols
 - Converting to lowercase

 This ensures the palindrome check is logical rather
 than character-format dependent.
 hh
 Example:
 "A man a plan a canal Panama"

 @author PranavSRM
 @version 10.0
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

        if (isPalindrome(input)) {
            System.out.println("Result: It's a palindrome!");
        } else {
            System.out.println("Result: Not a palindrome.");
        }
    }

    /**
     * UC 10: Case-Insensitive & Space-Ignored Palindrome
     *Goal: Ignore spaces and case while checking a palindrome.
     */

    public static boolean isPalindrome(String s) {
        // Step 1: Normalize string (Ignore spaces and case using Regex)
        String normalized = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Apply palindrome logic (Reverse and compare)
        String reversed = new StringBuilder(normalized).reverse().toString();

        return normalized.equals(reversed);
    }
}