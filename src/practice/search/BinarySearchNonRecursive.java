package practice.search;

import java.util.Arrays;

public class BinarySearchNonRecursive {
    public static void main(String[] args) {
        int[] array = {0, 9, 4, 7, 8};
        Arrays.sort(array);
        System.out.println("After sorting array as binary search require sorted array:");
        for (int i : array) {
            System.out.print(i + "  ");
        }
        int index = search(array, 8);
        System.out.println("\nelement is at index:" + index);
    }

    private static int search(int[] array, int i) {
        int m = (array.length) / 2;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[m] < i) {
                left = m + 1;
            } else if (array[m] > i) {
                right = m - 1;
            } else {
                return m;
            }
            m = left + (right - left) / 2;
        }
        return -1;
    }
}
