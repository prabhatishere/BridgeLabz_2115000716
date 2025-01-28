// Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
// Hint => 
// Write a method to Generate a 6-digit OTP number using Math.random() 
// Create an array to save the OTP numbers generated 10 times
// Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false



import java.util.*;
public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }
    public static int generateOTP() {
        Random rand = new Random();
        return rand.nextInt(900000) + 100000; // Generate a 6-digit random number
    }
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length - 1; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }


}

