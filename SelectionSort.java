public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        int n = input.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
          
            for (int j = i + 1; j < n; j++) {
                if (input[j] < input[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first
            // element
            int temp = input[min_idx];
            input[min_idx] = input[i];
            input[i] = temp;
        }
    }
}
