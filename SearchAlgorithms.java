// You are given a list of integers. Write a program that uses Linear Search to find the first missing 
// positive integer in the list and Binary Search to find the index of a given target number.
// Approach:
// Linear Search for the first missing positive integer:
// Iterate through the list and mark each number in the list as visited (you can use negative marking or a separate array).
// Traverse the array again to find the first positive integer that is not marked.
// Binary Search for the target index:
// After sorting the array, perform binary search to find the index of the given target number.
// Return the index if found, otherwise return -1.




import java.util.Arrays;

public class SearchAlgorithms {
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First missing positive: " + findFirstMissingPositive(arr));
        
        int[] sortedArr = {1, 2, 3, 4, 5, 6};
        int target = 4;
        System.out.println("Target index: " + binarySearch(sortedArr, target));
    }
}
