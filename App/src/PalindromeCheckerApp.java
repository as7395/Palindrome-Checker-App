import java.util.Scanner;

public class PalindromeCheckerApp {

        public static boolean isPalindrome(String str) {
            char[] arr = str.toCharArray();

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                if (arr[left] != arr[right]) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

        public static void main(String[] args) {
            String input = "madam";
            System.out.println(isPalindrome(input));  // true
        }
    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String input = scanner.nextLine();
            input = input.replaceAll("\\s+", "").toLowerCase();
            String reversed = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }
            if (input.equals(reversed)) {
                System.out.println("The input is a palindrome.");
            } else {
                System.out.println("The input is NOT a palindrome.");
            }
            scanner.close();
        }
    }
