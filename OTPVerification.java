import java.util.Scanner;

public class OTPVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Predefined OTP
        String originalOTP = "4589";

        // User input
        System.out.print("Enter OTP: ");
        String userOTP = sc.nextLine();

        // Verification
        if (originalOTP.equals(userOTP)) {
            System.out.println("OTP Verified Successfully");
        } else {
            System.out.println("Invalid OTP");
        }

        // Demonstrating String immutability
        String modifiedOTP = originalOTP.concat("123");

        System.out.println("Original OTP: " + originalOTP);
        System.out.println("Modified OTP after concat: " + modifiedOTP);

        sc.close();
    }
}