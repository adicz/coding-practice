package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 * @link: https://leetcode.com/problems/top-k-frequent-elements/
 * @difficulty: MEDIUM
 */
public class T347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Map<Integer, Long> frequentOfElements = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Long> sortedFrequentest = frequentOfElements.values().stream()
                .sorted(Comparator.reverseOrder())
                .limit(k)
                .collect(Collectors.toList());

        List<Integer> resultList = frequentOfElements.entrySet().stream()
                .filter(entry -> entry.getValue() >= sortedFrequentest.get(sortedFrequentest.size() - 1))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
