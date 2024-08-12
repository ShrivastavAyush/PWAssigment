package Assignment_1D_array;

public class Maximum_Element2 {
    public static void main(String[] args) {
        int[] arr = {4,3,7,6,1};
        int n = arr.length;
        int Maximum = arr[0];
        for(int i=1; i<n; i++){
            if(Maximum < arr[i]){
                Maximum = arr[i];
            }
        }
        System.out.println("The maximum element of given array is:- "+ Maximum);
    }
}
