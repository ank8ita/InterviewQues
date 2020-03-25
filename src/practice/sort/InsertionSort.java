package practice.sort;

/**
 * worst-case:n2
 * Best-case:n
 * Algorithm:
 *          Starting from first element, we compare it with every other element.
 *          if element is greater than comparing element then we swap it
 *          So we get the smallest number in first iteration.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int unsortedArray[] = {3, 8, 0, 2, 7, 1};
        insertionSort(unsortedArray);
    }

    private static void insertionSort(int[] unsortedArray) {
        int temp;
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = i; j < unsortedArray.length; j++) {
                if (unsortedArray[i] > unsortedArray[j]) {
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }
        for(int i:unsortedArray){
            System.out.println(i);

        }
    }
}
