/**

MAIN CLASS UseCase5Palindrome CheckerApp
Use Case 5: Stack Based Palindrome Checker
Description:
This class validates a palindrome using a Stack
*data structure which follows the LIFO principle.
 At this stage, the application:
Pushes characters into a stack
Pops them in reverse order
Compares with original sequence
Displays the result
This maps stack behavior to reversal logic.
@author PranavSRM
@version 5.0

 **/
import java .util.*;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Standardize input (optional but recommended for mixed-case)
        String standardizedInput = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        Stack<Character> stack = new Stack<>();

        // Step 1: Push characters into stack
        for (int i = 0; i < standardizedInput.length(); i++) {
            stack.push(standardizedInput.charAt(i));
        }

        // Step 2: Pop and build reversed string
        StringBuilder reversedInput = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedInput.append(stack.pop());
        }

        // Step 3: Print result
        if (standardizedInput.equals(reversedInput.toString())) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is not a palindrome.");
        }

        scanner.close();
    }
}
