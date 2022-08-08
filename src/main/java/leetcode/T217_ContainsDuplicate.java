package leetcode;


import java.util.HashSet;
import java.util.Set;


/**
 * https://leetcode.com/problems/contains-duplicate/
 */
class T217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (Integer num : nums) {
            if (!integerSet.add(num)) {
                 return true;
            }
        }
        return false;
    }
}
