package coderbyte;

import java.util.LinkedList;
import java.util.List;

/**
 * @difficulty: MEDIUM
 */
public class ArrayChallenge {

    public static int ArrayChallenge(int[] arr) {
        int j = 2;
        int sum = 0;
        int nextStep = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        List<Integer> fibonacciList = new LinkedList<>();
        fibonacciList.add(1);
        fibonacciList.add(1);

        while (nextStep < sum) {
            nextStep = fibonacciList.get(j - 2) + fibonacciList.get(j - 1);
            fibonacciList.add(nextStep);
            j++;
        }

        Integer greaterDiff = sum - fibonacciList.get(fibonacciList.size() - 1);
        Integer lowerDiff = sum - fibonacciList.get(fibonacciList.size() - 2);

        return Math.min(Math.abs(greaterDiff), Math.abs(lowerDiff));
    }

}
