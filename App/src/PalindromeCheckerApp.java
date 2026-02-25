
import java.util.*;
public class PalindromeCheckerApp {
        public static boolean isPalindrome(String str) {
            Deque<Character> deque = new ArrayDeque<>();

            // Insert characters into deque
            for (int i = 0; i < str.length(); i++) {
                deque.addLast(str.charAt(i));
            }

            // Compare front and rear
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
        // Compare dequeue and po
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            if (isPalindrome(input)) {
                System.out.println("Result: Palindrome ✅");
            } else {
                System.out.println("Result: Not a Palindrome ❌");
            }

            sc.close();
        }
    }