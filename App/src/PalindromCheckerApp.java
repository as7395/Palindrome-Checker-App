public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str, int start, int end) {
        // Base Condition
        if (start >= end)
            return true;

        // Compare characters
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "madam";

        if (isPalindrome(input, 0, input.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
