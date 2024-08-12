package Assignment_1D_array;

public class Peak_Element1 {
    public static void main(String[] args) {
        int[] arr = { 1,3,2,6,5};
        int n = arr.length;
        int peak_Element = 0;
        for (int i=1; i<n; i++){
            if( arr[i]>arr[i-1]){
                if(arr[i]>arr[i+1]){
                    peak_Element = arr[i];
                }
            }
        }
        System.out.println("Peak Element in given array is:- " + peak_Element);
    }
}
