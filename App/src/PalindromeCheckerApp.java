
import java.util.*;
public class PalindromeCheckerApp {

        public static boolean isPalindrome(String str) {
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            // Insert characters into both data structures
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                queue.add(ch);     // Enqueue (FIFO)
                stack.push(ch);    // Push (LIFO)
            }

            // Compare dequeue and pop
            while (!queue.isEmpty()) {
                if (queue.remove() != stack.pop()) {

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

