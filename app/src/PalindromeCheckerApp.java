/**
 * MAIN CLASS UseCase4PalindromeCheckerApp
 Use Case 4: Character Array Based Validation
 * Description:
 This class validates a palindrome by converting
 the string into a character array and comparing
 * characters using the two-pointer technique.
 At this stage, the application:
 Converts string to char array
 * - Uses start and end pointers
 Compares characters efficiently
 * Displays the result
 * This reduces extra memory usage.
 @author Developer
 @version 4.0

 **/
import java .util.*;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static boolean isPalindrome(String str) {
        // Step 1: Convert string to char[]
        char[] charArray = str.toCharArray();

        // Step 2: Use two-pointer approach
        int start = 0;
        int end = charArray.length - 1;

        // Step 3: Compare start & end characters
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false; // Mismatch found, not a palindrome
            }
            start++; // Move front pointer forward
            end--;   // Move back pointer backward
        }

        return true; // No mismatches found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input Text: ");
        String input = sc.next();

        // Strengthen core programming fundamentals: handle case sensitivity if needed
        boolean result = isPalindrome(input.toLowerCase());

        System.out.println("Is '" + input + "' a palindrome? " + result);
    }
}
