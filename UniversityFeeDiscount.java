class UniversityFeeDiscount {
    public static void main(String[] args) {
        int fee = 125000; // Create a variable fee and assign value 125000
        int discountPercent = 10; // Create a variable discountPercent and assign 10 to it
        int discount = (fee * discountPercent) / 100; // Calculate discount by multiplying fee with discountPercent
        int discountedFee = fee - discount; // Calculate discounted Fee by subtracting discount from fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee); // Print the discount amount and discounted fee.
    }
}
