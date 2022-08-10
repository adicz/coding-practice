package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @link: https://leetcode.com/problems/group-anagrams/
 * @difficulty: MEDIUM
 */
public class T49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        Arrays.stream(strs).forEach(element -> {
            char[] wordAsChars = element.toCharArray();
            Arrays.sort(wordAsChars);
            String sortedWord = String.valueOf(wordAsChars);
            if (hashMap.containsKey(sortedWord)) {
                hashMap.get(sortedWord).add(element);
            } else {
                hashMap.put(sortedWord, new ArrayList<>());
                hashMap.get(sortedWord).add(element);
            }
        });

        return new ArrayList<>(hashMap.values());
    }
}
