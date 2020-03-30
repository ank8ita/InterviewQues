package practice.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefaultSearch {
    public static void main(String[] args) {
        int[] array = {0, 9, 4, 7, 8};
        List<Integer> list = new ArrayList();
        list.add(8);list.add(3);list.add(0);list.add(2);list.add(7);list.add(6);list.add(9);
        Arrays.sort(array);
        System.out.println("After sorting array as binary search require sorted array:");
        for (int i : array) {
            System.out.print(i + "  ");
        }
        int index = Arrays.binarySearch(array,8);
        System.out.println("\nelement is at index in array:" + index);

        Collections.sort(list);
        System.out.println("After sorting list as binary search require sorted list:");
        for (int i : list) {
            System.out.print(i + "  ");
        }
        index = Collections.binarySearch(list,9);
        System.out.println("\nelement is at index in list:" + index);

    }
}
