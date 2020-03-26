package practice.sort;

/**
 * Best case: n2
 * Worst case: n
 * Algorithm: we select find the min value and place it to first place
 *            Then find min value in remaining array and place it to second place and so on...
 */
public class SelectionSort {
    public static void main(String[] args) {
        int unsortedArray[] = {8, 2, 5, 1, 0};
        selectionSort(unsortedArray);
    }

    private static void selectionSort(int[] unsortedArray) {
        int temp;
        int min = 0;
        for (int i = 0; i < unsortedArray.length; i++) {
            min = i;
           for(int j = i+1; j < unsortedArray.length;j++){
                if(unsortedArray[j] < unsortedArray[min]){
                    min = j;
                }
           }
           if(min != i){
               temp = unsortedArray[i];
               unsortedArray[i] = unsortedArray[min];
               unsortedArray[min] = temp;
           }
        }

        for (int i: unsortedArray){
            System.out.println(i);
        }
    }
}
