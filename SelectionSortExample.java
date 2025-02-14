import java.util.Arrays;

public class SelectionSortExample {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {85, 92, 76, 63, 99, 88};

        System.out.println("Before Sorting: " + Arrays.toString(examScores));

        selectionSort(examScores);

        System.out.println("After Sorting: " + Arrays.toString(examScores));
    }
}
