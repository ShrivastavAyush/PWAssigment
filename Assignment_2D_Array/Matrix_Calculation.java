package Assignment_2D_Array;

import java.util.Scanner;

public class Matrix_Calculation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers of rows:- ");
        int Row_M = sc.nextInt();
        System.out.println("Please enter the numbers of columns:- ");
        int Column_N = sc.nextInt();
        int[][] arr = new int[Row_M][Column_N];
        System.out.println("Please enter the values according to rows and columns");
        for (int i = 0; i < Row_M; i++)
        {
            for (int j = 0; j < Column_N; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int Positive_Numbers_Count = 0;
        int Negative_Number_Count = 0;
        int Odd_Numbers_Count = 0;
        int Even_Numbers_Count = 0;
        int Numbers_Of_O = 0;
         for(int a=0; a<Row_M; a++)
         {
             for(int b=0; b<Column_N; b++)
             {
                 if(arr[a][b]>0)
                 {
                    Positive_Numbers_Count++;
                 }
                 if (arr[a][b]<0)
                 {
                     Negative_Number_Count++;
                 }
                 if (arr[a][b]%2!=0)
                 {
                     Odd_Numbers_Count++;
                 }
                 if (arr[a][b]%2==0)
                 {
                     Even_Numbers_Count++;
                 }
                 if (arr[a][b]==0)
                 {
                     Numbers_Of_O++;
                 }
             }
         }
        System.out.println("Numbers of Positive Numbers:- " + Positive_Numbers_Count);
        System.out.println("Numbers of Negative Numbers:- " + Negative_Number_Count);
        System.out.println("Numbers of Odd Numbers:- " + Odd_Numbers_Count);
        System.out.println("Numbers of Even Numbers:- " + Even_Numbers_Count );
        System.out.println("Numbers of O Numbers:- " + Numbers_Of_O);
    }
}



