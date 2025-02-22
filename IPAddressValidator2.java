import java.util.regex.*;

public class IPAddressValidator2 {
    public static boolean isValidIP(String ip) {
        String ipPattern = 
            "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        return ip.matches(ipPattern);
    }

    public static void main(String[] args) {
        String ip1 = "192.168.1.1";
        String ip2 = "999.999.999.999";
        
        System.out.println(ip1 + " is " + (isValidIP(ip1) ? "valid ✅" : "invalid ❌"));
        System.out.println(ip2 + " is " + (isValidIP(ip2) ? "valid ✅" : "invalid ❌"));
    }
}
