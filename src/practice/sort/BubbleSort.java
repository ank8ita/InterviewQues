package practice.sort;

/**
 * worstCase complexity:O(n2)
 * BestCase Complexity:O(n)
 * Algorithm: In bubble sort we compare current element value with next element value.
 *            If current value is greater the next value we swap it.
 *            so in first iteration we get greatest element at the end of our array.
 *            we need to iterate over array n times to compare values.
 *            n represent length of array.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int unsortedArray[] = {2, 5, 1, 0, 9};
        bubblesort(unsortedArray);

    }

    private static void bubblesort(int[] unsortedArray) {
        int temp;
        for (int i = unsortedArray.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    temp = unsortedArray[j + 1];
                    unsortedArray[j + 1] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }
        for (int num : unsortedArray) {
            System.out.println(num);

        }
    }

}
