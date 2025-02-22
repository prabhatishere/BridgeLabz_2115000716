import java.util.regex.*;

public class ValidateCreditCard {
    public static boolean isValidCreditCard(String cardNumber) {
        // Regular expressions for Visa and MasterCard
        String visaRegex = "^4[0-9]{15}$";  // Starts with 4, 16 digits
        String masterCardRegex = "^5[0-9]{15}$";  // Starts with 5, 16 digits

        // Compile patterns
        Pattern visaPattern = Pattern.compile(visaRegex);
        Pattern masterCardPattern = Pattern.compile(masterCardRegex);

        // Check against both patterns
        return visaPattern.matcher(cardNumber).matches() || masterCardPattern.matcher(cardNumber).matches();
    }

    public static void main(String[] args) {
        String[] testCards = {
            "4111111111111111", // ✅ Valid Visa
            "5555555555554444", // ✅ Valid MasterCard
            "4222222222222", // ❌ Invalid (Visa but not 16 digits)
            "511111111111111", // ❌ Invalid (MasterCard but only 15 digits)
            "6111111111111111", // ❌ Invalid (Doesn't start with 4 or 5)
            "4000000000000000" // ✅ Valid Visa
        };

        for (String card : testCards) {
            System.out.println(card + " -> " + (isValidCreditCard(card) ? "Valid ✅" : "Invalid ❌"));
        }
    }
}
