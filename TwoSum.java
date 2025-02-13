import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i}; // Return the indices
            }

            // Store the current element and its index in the map
            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }
}
