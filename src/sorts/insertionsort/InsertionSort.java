package sorts.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) { // time complexity O(n^2), and space complexity O(1), only insertionSort is O(n) when you start with sorted(almost sorted) data
        for (int i = 1; i < array.length; i++) { // start with the second item
            int temp = array[i]; // current value
            int j = i - 1; // it points to the previous item
            while (j > -1 && temp < array[j]) { //compare to half of the array(the first half), not the entire at once
                //while the values is less than the current, it swaps
                array[j+1] = array[j]; //move the value of index 2 to index 1
                array[j] = temp; // move the value of index 1 to index 2
                j--;
            }
        }
    }


    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        insertionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}


