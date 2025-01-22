class ProfitAndLoss {
    public static void main(String[] args) {
        int costPrice = 129, sellingPrice = 191; // Assigning the costPrice & sellingPrice variables values in a single line.
        int profit = sellingPrice - costPrice; // Calculate Profit : Subtract costPrice from sellingPrice
        double profitPercentage = (profit / (double) costPrice) * 100; // Calculate profit percentage with this formula
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage); // Print the profit percentage
    }
}
