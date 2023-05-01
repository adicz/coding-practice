package leetcode;

/**
 * @link: https://leetcode.com/problems/valid-palindrome/
 * @difficulty: EASY
 */
public class T125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        final String onlyLetters = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        final String reversedString = new StringBuilder(onlyLetters).reverse().toString().toLowerCase();
        return onlyLetters.equals(reversedString);
    }
}
