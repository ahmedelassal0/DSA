package algorithms.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{5, 3, 98, 4, 56, 5, 56, 7})));
    }


    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) return array;
        int midPoint = (int) (array.length / 2);
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midPoint));
        int[] right = mergeSort(Arrays.copyOfRange(array, midPoint, array.length));
        return merge(left, right);
    }

    /*
     * They have to be sorted
     * */
    public static int[] merge(int[] array1, int[] array2) {
        int pointer1 = 0;
        int pointer2 = 0;
        int[] resultArray = new int[array1.length + array2.length];
        int resultArrayNElements = 0;

        while (pointer1 < array1.length && pointer2 < array2.length) {
            if (array1[pointer1] < array2[pointer2]) {
                resultArray[resultArrayNElements] = array1[pointer1];
                pointer1++;
                resultArrayNElements++;
            } else {
                resultArray[resultArrayNElements] = array2[pointer2];
                pointer2++;
                resultArrayNElements++;
            }
        }

        while (pointer1 < array1.length) {
            resultArray[resultArrayNElements] = array1[pointer1];
            pointer1++;
            resultArrayNElements++;
        }

        while (pointer2 < array2.length) {
            resultArray[resultArrayNElements] = array2[pointer2];
            pointer2++;
            resultArrayNElements++;
        }
        return resultArray;
    }
}
