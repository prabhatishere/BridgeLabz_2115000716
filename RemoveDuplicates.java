// Problem:
// Write a program that uses StringBuilder to remove all duplicate characters 
// from a given string while maintaining the original order.


import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }
            else{
                continue;
            }
        }
        System.out.println(sb);

    }
}
