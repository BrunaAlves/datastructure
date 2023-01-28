package sorts.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) { //O(1), because we don't have to make a copy
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) { // compare if the first value(ex. value 4, index 1) is bigger that the second value (ex. value 2, index 2)
                    int temp = array[j]; //value of the item in the index j as a temp(ex. value 4, index 1)
                    array[j] = array[j+1]; //move the second value(ex.2, index 1) to the current position(ex. index 1). So the index 1 will receive the value of the index 2
                    array[j+1] = temp; // then the value of 4 go to the index of the value 2
                    //start as [4,2] end as [2,4]
                }
            }
        }
    }



    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        bubbleSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}

