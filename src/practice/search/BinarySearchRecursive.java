package practice.search;

import java.util.Arrays;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] array = {0, 9, 4, 7, 8};
        Arrays.sort(array);
        System.out.println("After sorting array as binary search require sorted array:");
        for (int i : array) {
            System.out.print(i + "  ");
        }
        int index = search(array, 0, array.length - 1, 8);
        System.out.println("\nelement is at index:" + index);
    }

    private static int search(int[] array, int left, int right, int element) {
        int mid = left + (right - left) / 2;
        if (left == right) {
            return -1;
        } else {
            if (array[mid] < element) {
                return search(array, mid + 1, right, element);
            } else if (array[mid] > element) {
                return search(array, left, mid - 1, element);
            } else {
                return mid;
            }
        }
    }
}
