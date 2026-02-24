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
import java.util.Scanner;
public class PalindromeCheckerApp {
    /**
     Application entry point.
     This is the first method executed by the JVM
     when the program starts.
     @param args Command-Line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input Text: ");
        String input = sc.next();
        boolean ispalindrome=true;
        int n = input.length();
        for(int i=0;i<n/2;i++){
            if(input.charAt(i)!=input.charAt(n-1-i)){
                ispalindrome=false;
                break;
            }
        }
        System.out.println("Is it a palindrome?\n"+ispalindrome);
    }

}