package practice.sort;

/**
 * WorstCase:n2
 * BestCase:n*log(n)
 * Algorithm: quickSort(arr[], low, high)
 *              {
 *              if (low < high)
 *                  {
 *                    pi=partition(arr,low,high);
 *                    quickSort(arr,low,pi-1);  // Before pi
 *                    quickSort(arr,pi+1,high); // After pi
 *                   }
 *               }
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] unsortedArray = {9, 3, 2, 0, 1, 8, 7};
        quickSort(unsortedArray, 0, unsortedArray.length - 1);
        for (int i : unsortedArray) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] unsortedArray, int left, int right) {
        if (left < right) {
            int pi = partition(unsortedArray, left, right);
            quickSort(unsortedArray, left, pi - 1);
            quickSort(unsortedArray, pi + 1, right);
        }
    }

    private static int partition(int[] unsortedArray, int left, int right) {
        int pivot = unsortedArray[right];
        int i = (left - 1); // index of smaller element
        for (int j = left; j < right; j++) {
            // If current element is smaller than the pivot
            if (unsortedArray[j] < pivot) {
                i++;

                int temp = unsortedArray[i];
                unsortedArray[i] = unsortedArray[j];
                unsortedArray[j] = temp;
            }
        }

        int temp = unsortedArray[i + 1];
        unsortedArray[i + 1] = unsortedArray[right];
        unsortedArray[right] = temp;
        return i + 1;
    }
}
