// Create a program to find the shortest, tallest, and mean height of players present in a football team.
// Hint => 
// The formula to calculate the mean is: mean = sum of all elements/number of elements
// Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
// Write the method to Find the sum of all the elements present in the array.
// Write the method to find the mean height of the players on the football team
// Write the method to find the shortest height of the players on the football team 
// Write the method to find the tallest height of the players on the football team
// Finally display the results


import java.util.*;
public class FootballTeam {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; 
        }

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + String.format("%.2f", mean) + " cm");
    }
    static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
    static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
    static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
}
