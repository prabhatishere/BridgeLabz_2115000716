// You are given a 2D matrix where each row is sorted in ascending order, and the first element of each row is 
// greater than the last element of the previous row. Write a program that performs Binary Search to find a 
// target value in the matrix. If the value is found, return true. Otherwise, return false.
// Approach:
// Treat the matrix as a 1D array (flattened version).
// Initialize left as 0 and right as rows * columns - 1.
// Perform binary search:
// Find the middle element index mid = (left + right) / 2.
// Convert mid to row and column indices using row = mid / numColumns and col = mid % numColumns.
// Compare the middle element with the target:
// If it matches, return true.
// If the target is smaller, search the left half by updating right = mid - 1.
// If the target is larger, search the right half by updating left = mid + 1.
// If the element is not found, return false.


public class MatrixBinarySearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];
            
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        System.out.println("Target found: " + searchMatrix(matrix, target));
    }
}
