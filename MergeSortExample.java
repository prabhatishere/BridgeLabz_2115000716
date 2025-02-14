import java.util.Arrays;

public class MergeSortExample {

    public static void mergeSort(int[] prices) {
        if (prices.length <= 1) {
            return;
        }

        int mid = prices.length / 2;
        int[] left = Arrays.copyOfRange(prices, 0, mid);
        int[] right = Arrays.copyOfRange(prices, mid, prices.length);

        mergeSort(left);
        mergeSort(right);

        merge(prices, left, right);
    }

    private static void merge(int[] prices, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                prices[k++] = left[i++];
            } else {
                prices[k++] = right[j++];
            }
        }

        while (i < left.length) {
            prices[k++] = left[i++];
        }

        while (j < right.length) {
            prices[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] bookPrices = {500, 300, 150, 200, 450, 100};

        System.out.println("Before Sorting: " + Arrays.toString(bookPrices));

        mergeSort(bookPrices);

        System.out.println("After Sorting: " + Arrays.toString(bookPrices));
    }
}

