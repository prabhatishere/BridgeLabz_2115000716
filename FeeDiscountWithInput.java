import java.util.Scanner;
class FeeDiscountWithInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the fee amount: ");
        int fee = sc.nextInt(); // Take user input for fee in variable fee
        System.out.print("Enter the discount percentage: ");
        int discountPercent = sc.nextInt(); // Take user input for discount percentage in variable dsicountPercent
        int discount = (fee * discountPercent) / 100; // Calculate discount with this formula
        int discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
        sc.close();
    }
}
