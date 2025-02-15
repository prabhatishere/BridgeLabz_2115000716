// You are given an array of strings. Write a program that uses StringBuffer to 
// concatenate all the strings in the array efficiently.
// Approach:
// Create a new StringBuffer object.
// Iterate through each string in the array and append it to the StringBuffer.
// Return the concatenated string after the loop finishes.
// Using StringBuffer ensures efficient string concatenation due to its mutable nature.



import java.util.*;
public class ConcatenateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of String array: ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[size];
        System.out.println("Enter the string elements of array: ");
        for(int i=0;i<size;i++){
            strings[i] = sc.nextLine();
        }
        System.out.println("=====Input Done========");
        StringBuffer sf = new StringBuffer();
        for(String el : strings){
            sf.append(el+" ");
        }
        System.out.println("Concatenated string is: "+sf);
        System.out.println(System.nanoTime());

    }
}
