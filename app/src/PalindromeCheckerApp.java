/**
 MAIN CLASS UseCase7Palindrome CheckerApp
 Use Case 7: Deque Based Optimized Palindrome Checker
 Description:
 This class validates a palindrome using a Deque
 (Double Ended Queue).
 Characters are inserted into the deque and then
 compared by removing elements from both ends:
 removeFirst()
 removeLast()
 This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 This use case demonstrates optimal bidirectional
 troversal using Deque.

@author PranavSRM
@version 7.0
**/
import java .util.*;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 2: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a string to check if it's a palindrome: ");

        // Step 3: Read user input
        String userInput = scanner.nextLine();

        // Apply Palindrome Logic (from previous turn)
        if (isPalindrome(userInput)) {
            System.out.println("'" + userInput + "' is a palindrome!");
        } else {
            System.out.println("'" + userInput + "' is not a palindrome.");
        }

        // Step 4: Close scanner
        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        Deque<Character> charDeque = new LinkedList<>();
        for (char ch : input.toLowerCase().toCharArray()) {
            charDeque.addLast(ch);
        }
        while (charDeque.size() > 1) {
            if (charDeque.removeFirst() != charDeque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}