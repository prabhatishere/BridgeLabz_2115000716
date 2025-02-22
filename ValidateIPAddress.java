import java.util.regex.*;

public class ValidateIPAddress {
    public static boolean isValidIPAddress(String ip) {
        // Regular expression for a valid IPv4 address
        String ipRegex = 
            "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}" + 
            "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(ipRegex);
        Matcher matcher = pattern.matcher(ip);

        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testIPs = {
            "192.168.1.1",  // ✅ Valid
            "255.255.255.255", // ✅ Valid
            "256.100.50.25", // ❌ Invalid (256 > 255)
            "192.168.1", // ❌ Invalid (Only 3 sections)
            "192.168.1.300", // ❌ Invalid (300 > 255)
            "abc.def.ghi.jkl" // ❌ Invalid (Non-numeric)
        };

        for (String ip : testIPs) {
            System.out.println(ip + " -> " + (isValidIPAddress(ip) ? "Valid ✅" : "Invalid ❌"));
        }
    }
}
