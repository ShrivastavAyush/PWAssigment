package Assignment_1D_array;

public class Sum_Of_Even_indices1 {
    public static void main(String[] args) {
        int[] arr = {3,20,4,6,9};
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
                if(i%2==0){
                    sum+= arr[i];
                }
            }
        System.out.println("The sum of element present on even indices are :- " + sum);
        }
    }
// time complexity will be O(n).
// Space complexity will be O(1).