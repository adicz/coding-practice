package leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * @link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * @difficulty: EASY
 */
public class T20_ValidParentheses {
    public boolean isValid(String s) {
        if (s.isBlank() || s.length() == 1) {
            return false;
        }

        final HashMap<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        final Stack<Character> bracketsStack = new Stack<>();

        for (int i = 0; i < s.length() ; i++) {
            char charAt = s.charAt(i);
            if (bracketPairs.containsValue(charAt)) {
                bracketsStack.push(charAt);
            } else if (bracketPairs.containsKey(charAt) && !bracketsStack.isEmpty()) {
                if (bracketPairs.get(charAt) == bracketsStack.peek()) {
                    bracketsStack.pop();
                }
                else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return bracketsStack.isEmpty();
    }
}
