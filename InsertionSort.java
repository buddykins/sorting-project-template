public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        for (int i = 1; i < input.length; i++) { // Start from index 1
            int storage = input[i];
            int temp = i - 1;
    
            // Move elements that are greater than 'storage' one position ahead
            while (temp >= 0 && input[temp] > storage) { 
                input[temp + 1] = input[temp];
                temp = temp - 1;
            }
    
            input[temp + 1] = storage; // Insert element at the correct position
        }
    }
   
}
