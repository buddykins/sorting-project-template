public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        int[] stored = {0,input.length};
        int storage;
        for (int i = 0; i < input.length; i++){
            storage = input[i];
            if (i == 0){
                stored[i] = input[i];
            }
            else{
                System.out.println(stored); // comment out once it works
                for (int l = 0; l < stored.length; l++){

                }
              
            }
        }
    }
    public int[] insertBefore(int index, int number, int[] stored){
        int[] inserted = {0,stored.length};
        for (int j = index; j < stored.length; j++){
            if (j == index){
                inserted[j] = number;
            }
            else{
                inserted[j] = stored[j--]; 
            }
        }
        return inserted;
    }
}
