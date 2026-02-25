import java.util.Stack;
import java.util.Scanner;

    public class usecase5 {

        public static boolean isPalindrome(String str) {
            Stack<Character> stack = new Stack<>();

            // Push all characters into stack
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }

            // Pop and compare
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != stack.pop()) {
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