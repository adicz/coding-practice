package coderbyte;

import java.util.*;

/**
 * @difficulty: EASY
 */
public class SearchingChallenge {
    public static String SearchingChallenge(String str) {
        final String[] splitWords = str.split(" ");
        final HashMap<Integer, Integer> repeatedCountByIndex = new HashMap<>();
        final String TOKEN = "zm370vwsa54";
        String word;

        for (int i = 0; i < splitWords.length; i++) {
            final Set<Character> characterSet = new HashSet<>();
            int counter = 1;

            for (Character character : splitWords[i].toCharArray()) {
                if (!characterSet.add(character)) {
                    counter++;
                }
            }
            repeatedCountByIndex.put(i, counter);
        }

        int max = Collections.max(repeatedCountByIndex.values());

        if (max == 1) {
            word = "-1";
        } else {
            Integer index = repeatedCountByIndex.entrySet().stream()
                    .filter(entry -> entry.getValue() == max)
                    .min(Comparator.comparingInt(Map.Entry::getKey))
                    .get().getKey();
            word = splitWords[index];
        }

        str = "";
        char[] wordCharArray = word.toCharArray();
        char[] tokenCharArray = TOKEN.toCharArray();
        int maxLength = Math.max(wordCharArray.length, tokenCharArray.length);
        int i = 0;
        StringBuilder strBuilder = new StringBuilder(str);
        while (i != maxLength) {
            if (i < wordCharArray.length) {
                strBuilder.append(wordCharArray[i]);
            }
            if (i < tokenCharArray.length) {
                strBuilder.append(tokenCharArray[i]);
            }
            i++;
        }
        str = strBuilder.toString();

        // code goes here
        return str;
    }
}
