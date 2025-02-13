import java.util.*;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : arr) {
            int required = target - num;

            // If the complement exists, we found a pair
            if (seenNumbers.contains(required)) {
                System.out.println("Pair found: (" + num + ", " + required + ")");
                return true;
            }

            // Store the current number
            seenNumbers.add(num);
        }

        System.out.println("No pair found");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        hasPairWithSum(arr, target);
    }
}
