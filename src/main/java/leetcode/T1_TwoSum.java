package leetcode;

import java.util.HashMap;

/**
 * @link: https://leetcode.com/problems/two-sum/
 * @difficulty: EASY
 */
public class T1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> integerByIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (integerByIndex.containsKey(target - nums[i])) {
                return new int[]{integerByIndex.get(target - nums[i]), i};
            } else {
                integerByIndex.put(nums[i], i);
            }
        }
        return null;
    }
}
