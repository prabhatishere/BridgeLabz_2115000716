import java.util.regex.*;

public class SSNValidator {
    public static boolean isValidSSN(String ssn) {
        return ssn.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }

    public static void main(String[] args) {
        String ssn1 = "123-45-6789";
        String ssn2 = "123456789";
        
        System.out.println(ssn1 + " is " + (isValidSSN(ssn1) ? "valid ✅" : "invalid ❌"));
        System.out.println(ssn2 + " is " + (isValidSSN(ssn2) ? "valid ✅" : "invalid ❌"));
    }
}
