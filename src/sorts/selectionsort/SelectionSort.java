package sorts.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) { // time complexity O(n^2), and space complexity O(1)
        for (int i = 0; i < array.length; i++) {
            int minIndex = i; //ex. minIndex = 0
            for (int j = i+1; j < array.length; j++) { // compare the minIndex with the rest of the array, index 2
                if (array[j] < array[minIndex]) { //if the value of index 2 is less than value of index 1, then minIndex receive the index 2
                    minIndex = j;
                }
            }
            if (i != minIndex) {  //if the minIndex is different from i we swap the values. if its equal to i means it's already in the right place
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }



    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        selectionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}


