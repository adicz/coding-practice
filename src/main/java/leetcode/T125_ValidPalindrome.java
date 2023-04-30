package leetcode;

import java.util.Arrays;

/**
 * @link: https://leetcode.com/problems/valid-palindrome/
 * @difficulty: EASY
 */
public class T125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        final String onlyLetters = s.replaceAll("", "").toLowerCase();
        final String reversedString = new StringBuilder(onlyLetters).reverse().toString().toLowerCase();

        char[] charArray = s.toCharArray();
        char[] reversedCharArray = reversedString.toCharArray();

        return Arrays.equals(charArray, reversedCharArray);
    }
}
