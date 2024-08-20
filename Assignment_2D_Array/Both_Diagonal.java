package Assignment_2D_Array;

import java.util.Scanner;

public class Both_Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Row size according to square Matrix ");
        int m = sc.nextInt();
        System.out.println("Please enter the Column size according to square Matrix");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Please enter the Matrix Values");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ( i+j==(n-1)||i==j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}