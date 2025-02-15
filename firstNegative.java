// You are given an integer array. Write a program that performs Linear Search to find the first negative 
// number in the array. If a negative number is found, return its index. If no negative number is found, return -1.
// Approach:
// Iterate through the array from the start.
// Check if the current element is negative.
// If a negative number is found, return its index.
// If the loop completes without finding a negative number, return -1.



import java.util.Scanner;

public class firstNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.println("Index of negative element is: "+i);
                return;
            }
            
        }
        System.out.println("Negative element not found: -1");

        

    }
}
