import java.util.regex.*;

public class CreditCardValidator {
    public static boolean isValidCard(String card) {
        return card.matches("^(4\\d{15}|5\\d{15})$");
    }

    public static void main(String[] args) {
        System.out.println(isValidCard("4111111111111111")); // Visa → true
        System.out.println(isValidCard("5111111111111111")); // MasterCard → true
        System.out.println(isValidCard("6111111111111111")); // false
    }
}
