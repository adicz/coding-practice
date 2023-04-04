package leetcode;

import java.util.Arrays;

/**
 * @link: https://leetcode.com/problems/product-of-array-except-self/
 * @difficulty: MEDIUM
 */
public class T238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int leftProduct = 1, rightProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            left[i] = leftProduct;
            leftProduct *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            right[i] = rightProduct;
            rightProduct *= nums[i];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
