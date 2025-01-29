import java.util.*;

public class RemoveDuplicates {
    static String removeDuplicates(String str) {
        String result = "";
        Set<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeDuplicates(str));
        sc.close();
    }
}
