import java.util.regex.*;

public class IPAddressValidator {
    public static boolean isValidIP(String ip) {
        return ip.matches("\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b");
    }

    public static void main(String[] args) {
        System.out.println(isValidIP("192.168.1.1")); // true
        System.out.println(isValidIP("999.999.999.999")); // false
    }
}
