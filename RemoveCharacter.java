import java.util.*;

public class RemoveCharacter {
    static String removeChar(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(removeChar(str, ch));
        sc.close();
    }
}
