import java.util.*;

public class MostFrequentCharacter {
    static char mostFrequent(String str) {
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) freq[ch]++;
        
        char maxChar = str.charAt(0);
        for (char ch : str.toCharArray()) {
            if (freq[ch] > freq[maxChar]) maxChar = ch;
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Most Frequent Character: " + mostFrequent(str));
        sc.close();
    }
}
