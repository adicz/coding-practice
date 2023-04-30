package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @link: https://leetcode.com/problems/longest-consecutive-sequence/
 * @difficulty: MEDIUM
 */
public class T128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + count)) {
                    count++;
                }
                if (count > result) {
                    result = count;
                }
            }
        }
        return result;
    }
}
