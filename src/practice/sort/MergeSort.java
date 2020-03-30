package practice.sort;

/**
 * worst case: n*log(n)
 * best case: n*log(n)
 * Algorithm: If r > l
 *            1. Find the middle point to divide the array into two halves:
 *              middle m = (l+r)/2
 *            2. Call mergeSort for first half:
 *              Call mergeSort(arr, l, m)
 *            3. Call mergeSort for second half:
 *              Call mergeSort(arr, m+1, r)
 *            4. Merge the two halves sorted in step 2 and 3:
 *              Call merge(arr, l, m, r)
 */
public class MergeSort {

    public static void main(String[] args
    ) {
        int unsortedArray[] = {7, 1, 9, 3, 0, 2};
        sort(unsortedArray, 0, unsortedArray.length - 1);
        for (int i : unsortedArray) {
            System.out.println(i);
        }
    }

    public static void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            sort(array, left, middle);
            sort(array, middle + 1, right);
            mergeSort(array, left, middle, right);
        }
    }

    private static void mergeSort(int[] array, int left, int middle, int right) {
        int leftLength = middle - left + 1;
        int rightLength = right - middle;
        int leftArray[] = new int[leftLength], rightArray[] = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < rightLength; i++) {
            rightArray[i] = array[middle + i + 1];
        }
        int i = 0, j = 0, k = left;
        while (i < leftLength && j < rightLength) {
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftLength) {
            array[k++] = leftArray[i++];
        }
        while (j < rightLength) {
            array[k++] = rightArray[j++];
        }

    }
}


