/**
 MAIN CLASS UseCase&Palindrome CheckerApp
 Use Case 8: Linked List Based Palindrome Checker
 Description:
 This class checks whether a string is a palindrome
 using a LinkedList.
 Characters are added to the list and then compared
 by removing elements from both ends:
 removeFirst()
 * removeLast()
 This demonstrates how LinkedList supports
 double-ended operations for symmetric validation.

@author PranavSRM
@version 7.0
**/
import java .util.*;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    static class Node {
        char data;
        Node next;
        Node(char data) { this.data = data; }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker App ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 1. Convert string to linked list
        Node head = convertStringToLinkedList(input.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));

        if (isPalindrome(head)) {
            System.out.println("Result: The string is a palindrome!");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }

    // Goal: Check palindrome using singly linked list logic
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Flow 1 & 2: Find middle and Reverse second half
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalfHead = reverse(slow.next);

        // Flow 3: Compare halves
        Node p1 = head;
        Node p2 = secondHalfHead;
        while (p2 != null) {
            if (p1.data != p2.data) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    // Key Concept: In-Place Reversal
    private static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Helper to build the list from user input
    private static Node convertStringToLinkedList(String str) {
        if (str.isEmpty()) return null;
        Node head = new Node(str.charAt(0));
        Node current = head;
        for (int i = 1; i < str.length(); i++) {
            current.next = new Node(str.charAt(i));
            current = current.next;
        }
        return head;
    }
}