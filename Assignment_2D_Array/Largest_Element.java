package Assignment_2D_Array;

public class Largest_Element {
    public static void main(String[] args) {
        int [][] arr = {
                         { 1,2,23,4,},
                         { 5,6,17,-8 },
                         {9,110,11,12},
                         {13,4,150,169},
                       };
        int m = arr.length;
        int n = arr[0].length;
        int Largest_Element = arr[0][0];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(Largest_Element < arr[i][j]){
                    Largest_Element = arr[i][j];
                }
            }
        }
        System.out.println(Largest_Element);
     }
}
