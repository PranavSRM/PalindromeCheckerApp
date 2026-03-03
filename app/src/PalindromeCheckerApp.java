/**
 MAIN CLASS UseCase13PalindromeCheckenApp
 Use Case 13: Performance Comparison
 Description:
 This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *At this stage, the application:
 Uses a palindrome strategy implementation
 * Captures execution start and end tine
 Calculates total execution duration
 Displays benchmarking results
 This use case focuses purely on performance
 measurement and algorithm comparison.
 The goal is to introduce benchmarking concepts.
 Author PranavSRM
 @version 13.0
 **/
import java.util.*;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Palindrome Performance Checker (UC13) ===");
        System.out.print("Enter a string to test: ");
        String testStr = scanner.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");

        System.out.println("\nComparing Algorithms...");

        // 1. Two-Pointer Approach
        long start1 = System.nanoTime();
        boolean res1 = isPalindromeTwoPointer(testStr);
        long end1 = System.nanoTime();
        displayResult("Two-Pointer", res1, end1 - start1);

        // 2. StringBuilder Approach
        long start2 = System.nanoTime();
        boolean res2 = isPalindromeStringBuilder(testStr);
        long end2 = System.nanoTime();
        displayResult("StringBuilder", res2, end2 - start2);

        // 3. Recursive Approach
        long start3 = System.nanoTime();
        boolean res3 = isPalindromeRecursive(testStr, 0, testStr.length() - 1);
        long end3 = System.nanoTime();
        displayResult("Recursive", res3, end3 - start3);

        scanner.close();
    }

    // Two-Pointer: Most efficient, O(1) extra space
    public static boolean isPalindromeTwoPointer(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    // StringBuilder: Simple but creates a new object, O(n) space
    public static boolean isPalindromeStringBuilder(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    // Recursive: Checks first/last then calls itself for the inner string
    public static boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindromeRecursive(s, left + 1, right - 1);
    }

    private static void displayResult(String algo, boolean result, long time) {
        System.out.printf("%-15s | Palindrome: %-5s | Time: %d ns\n", algo, result, time);
    }
}
