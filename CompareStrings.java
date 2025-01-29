import java.util.*;

public class CompareStrings {
    static int compare(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return s1.charAt(i) - s2.charAt(i);
        }
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int result = compare(s1, s2);
        System.out.println(result < 0 ? s1 + " comes before " + s2 : (result > 0 ? s1 + " comes after " + s2 : "Both are equal"));
        sc.close();
    }
}
