import java.util.*;

public class ToggleCase {
    static String toggleCase(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            result += Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toggleCase(str));
        sc.close();
    }
}
