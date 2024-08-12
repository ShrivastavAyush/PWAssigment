package Assignment_1D_array;

public class Traversing_By_For_each_loop1 {
    public static void main(String[] args) {
        int[] arr = {34, 21, 54, 65, 43};
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j);
            } else {
                System.out.println(" ");
            }
        }
    }
}