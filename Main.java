public class Main {

   

    public static void main(String[] args)
    {
        // Task:
        // 1. Implement missing sorting algorithms.
        //    - InsertionSort.java done
        //    - SelectionSort.java done
        //
        //  2. Add a method to class Main to generate a random array.
        //  3. Provide random input to test suite and ensure your implementations
        //     of InsertionSort and Selection sort continue to work.
        //  4. Increase the loop count for TestSuite to get better performance results.
        int max = 9;
        int min = 1;
        int[] testInput = {(int) (Math.random() * (max - min + 1)) + min, (int) (Math.random() * (max - min + 1)) + min, (int) (Math.random() * (max - min + 1)) + min, (int) (Math.random() * (max - min + 1)) + min};
        
        
                // Increase the loop count to get better results once it works.
                // TestSuite.run(testInput, 10000);
                TestSuite.run(testInput, (int)(Math.random()*10)+1);
            }
            public static int ranNum(int scale) {
        int result = (int)Math.random() * scale;
        return result;
    }
}
