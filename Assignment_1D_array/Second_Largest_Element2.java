package Assignment_1D_array;

import java.util.*;

public class Second_Largest_Element2 {
    public static void main(String[] args) {
        int[] arr = { 4,3,7,6,1};
            int n = arr.length;
        Arrays.sort(arr);
        System.out.println(" Sorting arrays seems to be like:- " + Arrays.toString(arr));
        System.out.println(" Second Largest element " + arr[n-2]);
    }
}
