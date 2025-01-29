import java.util.*;

public class SubstringOccurrences {
    static int countOccurrences(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sc.next();
        System.out.println(countOccurrences(str, sub));
        sc.close();
    }
}
