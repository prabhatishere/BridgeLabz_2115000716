// A peak element is an element that is greater than its neighbors. Write a program that performs Binary Search to find a peak element in an array. If there are multiple peak elements, return any one of them.
// Approach:
// Initialize left as 0 and right as n - 1.
// Perform a binary search:
// Find the middle element mid = (left + right) / 2.
// If arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1], arr[mid] is a peak element.
// If arr[mid] < arr[mid - 1], then search the left half, updating right = mid - 1.
// If arr[mid] < arr[mid + 1], then search the right half, updating left = mid + 1.
// Continue until a peak element is found.



public class PeakElementBinarySearch {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int peakIndex = findPeakElement(arr);
        System.out.println("Index of a peak element: " + peakIndex);
    }
}
