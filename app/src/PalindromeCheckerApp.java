/**
MAIN CLASS UseCaselPalindromeApp
Use Case 1: Application Entry & Welcome Message
Description:
This class represents the entry point of the
Palindrome Checker Management System.
At this stage, the application:
Starts execution from the main() method
+ - Displays a welcome message
- Shows application version
 Just a hardcoded palindrome use case logic is implemented.
The goal is to establish a clear startup flow.
@author PranavSRM
@version 1.0
 **/
import java .util.Scanner;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input Text: ");
        String input = sc.next();
        String reversedInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }

        if (input.equals(reversedInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}