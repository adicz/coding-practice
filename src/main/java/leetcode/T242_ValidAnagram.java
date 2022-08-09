package leetcode;

import java.util.Arrays;

/**
 * @link: https://leetcode.com/problems/valid-anagram/
 * @difficulty: EASY
 */
public class T242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        Arrays.sort(charsS);
        Arrays.sort(charsT);

        return Arrays.equals(charsS, charsT);
    }
}
