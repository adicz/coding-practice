package leetcode;

/**
 * @link: https://leetcode.com/problems/longest-common-prefix/
 * @difficulty: EASY
 */
public class T14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (String str : strs) {
            result = findCommonPart(result, str);
        }
        return result;
    }

    private String findCommonPart(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        int i = 0;

        while (i < minLength && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }

        return s1.substring(0, i);
    }
}
