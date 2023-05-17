package leetcode;

/**
 * @link: https://leetcode.com/problems/palindrome-number/
 * @difficulty: EASY
 */
public class T9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        String numberAsString = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(numberAsString);
        StringBuilder reversed = stringBuilder.reverse();
        return numberAsString.equals(reversed.toString());
    }
}
