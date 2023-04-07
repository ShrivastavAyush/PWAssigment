public class Question1Alphabet {
    public static void main(String[] args) {
        int n = 10;
        //for Pattern A
        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                if(i==0&&j>0&&j<(n-1)/2||j==0&&i>0||i==(n-1)/2&&j<=(n-1)/2||j==(n-1)/2&&i>0){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            //For Pattern B
            for(int j=0; j<n; j++){
                if(j==0||i==0&&j<(n-1)/2||j==(n-1)/2&&i>0&&i<(n-1)/2||i==(n-1)/2&&j<(n-1)/2||i>(n-1)/2&&j==(n-1)/2&&i<n-1||i==n-1&&j<(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            //For Pattern C
            for(int j=0; j<n; j++) {
                if (i == 0 && j > 0 && j <= (n - 1) / 2 || j == 0 && i > 0 && i < (n - 1) || i == (n - 1) && j > 0 && j <= (n - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            //For Pattern D
            for(int j=0; j<n; j++){
                if(i==0&&j<(n-1)/2||j==0||i==n-1&&j<(n-1)/2||j==(n-1)/2&&i>0&&i<n-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            //For Pattern E
            for (int j=0; j<n; j++){
                if (j==0||i==0&&j<(n-1)/2||i==(n-1)/2&&j<(n-1)/2||i==n-1&&j<(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            //For Pattern F
            for (int j=0; j<n; j++){
                if (j==0||i==0&&j<(n-1)/2||i==(n-1)/2&&j<(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            //For Pattern G
            for(int j=0; j<n; j++){
                if(i==0&&j>0&&j<(n-1)/2||j==(n-1)/2&&i>0&&i<(n-1)/2-2||j==0&&i>0&&i<(n-1)||i==(n-1)&&j>0&&j<(n-1)/2||i>=(n-1)/2&&i<(n-1)&&j==(n-1)/2||i==(n-1)/2&&i+j>=6&&j<=(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            //For Pattern H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) / 2 || i == (n - 1) / 2 && j <(n - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
