package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // 5, 3, 98, 4, 56, 5, 56, 7
        System.out.println(Arrays.toString(insertionSort(new int[]{9, 8, 7, 6, 5, 4, 2, -8, 4})));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else break;
            }
        }
        return array;
    }
}