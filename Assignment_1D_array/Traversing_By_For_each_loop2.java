package Assignment_1D_array;

public class Traversing_By_For_each_loop2 {
    public static void main(String[] args){
        int[] arr = { 4,3,6,7,1};
        for( int K : arr){
            if(K%2==0){
                System.out.print(K);
            }
            else{
                System.out.println(" ");
            }
        }
    }
}
