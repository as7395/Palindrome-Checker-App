import java.util.*;
    class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

public class PalindromeCheckerApp {

        public static boolean isPalindrome(Node head) {
            if (head == null || head.next == null)
                return true;

            // Step 1: Find middle
            Node slow = head;
            Node fast = head;
t.n
            while (fast != null && fasext != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse second half
            Node prev = null;
            Node current = slow;
            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            // Step 3: Compare halves
            Node firstHalf = head;
            Node secondHalf = prev;

            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data)
                    return false;

                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }

        public static Node createList(String str) {
            Node head = null, tail = null;

            for (char ch : str.toCharArray()) {
                Node newNode = new Node(ch);
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            return head;
        }

        public static void main(String[] args) {
            String input = "madam";
            Node head = createList(input);

            if (isPalindrome(head))
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }
