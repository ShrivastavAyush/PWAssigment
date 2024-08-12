package Assignment_1D_array;

public class Peak_Element2 {
    public static void main(String[] args) {
        int[] arr = { 1,4,7,3,2,6,5};
            int n = arr.length;
            int peak_Element = 0;
            for( int i=1; i<n; i++){
                if( arr[i]>arr[i-1]){
                    if(arr[i]>arr[i+1]){
                        peak_Element = arr[i];
                        break;
                    }
                }
        }
        System.out.println(peak_Element);
    }
}
