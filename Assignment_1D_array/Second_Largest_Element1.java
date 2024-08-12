package Assignment_1D_array;

import java.util.*;

public class Second_Largest_Element1 {
    public static void main(String[] args) {
        int[] arr = { 34,21,54,65,43};
           int n = arr.length;
        Arrays.sort(arr);
        System.out.println("Array after sorting :- " + Arrays.toString(arr));
        System.out.println("Second Largest Element is:- " + arr[n-2]);
    }
}

