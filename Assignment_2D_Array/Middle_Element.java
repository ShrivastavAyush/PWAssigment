package Assignment_2D_Array;

public class Middle_Element {
    public static void main(String[] args) {
        int[][] arr = {
                       {  1, 2,3,4, 5},
                       { 11,12,3,5, 6},
                       { 23,10,5,8, 9},
                       { 33, 0,7,8,20},
                       {  2, 3,5,8,12 },
                      };
        int m = arr.length;
        int n = arr[0].length;
        for( int i=0; i<m;i++){
            for(int j=0; j<n; j++){
// Printing Approach 1
//            if( i==(m-1)/2){
//                System.out.print(arr[(m-1)/2][j]+ " ");
//            } else if (j==(n-1)/2){
//                System.out.print(arr[i][(n-1)/2]+ " ");
// Printing Approach 2
            if( i==(m-1)/2 || j==(n-1)/2){
                System.out.print(arr[i][j] + " ");
            }
            }
        }
    }
}
