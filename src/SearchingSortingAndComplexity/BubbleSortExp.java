package SearchingSortingAndComplexity;

public class BubbleSortExp {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};

        int n = arr.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted");
    }
}
