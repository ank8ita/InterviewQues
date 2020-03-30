package practice.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefaultSort {
    public static void main(String[] args) {
        int[] array ={8,3,0,2,7,6,9};
        List<Integer> list = new ArrayList();
        list.add(8);list.add(3);list.add(0);list.add(2);list.add(7);list.add(6);list.add(9);
        System.out.println("Before sorting array:");
        for (int i : array){
            System.out.print(i + "  ");
        }
        Arrays.sort(array);
        System.out.println("\nAfter sorting array:");
        for (int i: array){
            System.out.print(i + "  ");
        }

        System.out.println("\nBefore sorting list");
        for (Object i : list){
            System.out.print( i + "  ");
        }
        Collections.sort(list);
        System.out.println("\nAfter sorting list");
        for (Object i : list){
            System.out.print( i + "  ");
        }



    }
}
