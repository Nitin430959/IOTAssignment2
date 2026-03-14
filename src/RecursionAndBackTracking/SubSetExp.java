package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

public class SubSetExp {
    static void generateSubsets(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Include the current element
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);

        // Exclude the current element
        current.remove(current.size() - 1);
        generateSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> current = new ArrayList<>();

        generateSubsets(arr, 0, current);
    }
}

