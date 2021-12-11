package zxc;
import java.util.Scanner;
public class T2_6 {
    static int determinantOfMatrix(int mat[][], int n)
        {
            int D = 0;
            if (n == 1)
                return mat[0][0];
     
            int temp[][] = new int[n][n];
            int sign = 1;
            for (int f = 0; f < n; f++)
            {
               
                getCofactor(mat, temp, 0, f, n);
                D += sign * mat[0][f]
                     * determinantOfMatrix(temp, n - 1);
                sign = -sign;
            }
     
            return D;
        }
     
        /* function for displaying the matrix */
        static void display(int mat[][], int row, int col)
        {
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                    System.out.print(mat[i][j]);
     
                System.out.print("\n");
            }
        }
     
        
       public static void main(String[] args) {
                int n = 5; 
                int[][] a = new int[n][n];
                for (int i = 0; i < n; i ++) {
                    for (int j = 0; j < n; j ++) {
                        a[i][j] = i * n + j + 1;
                    }
                }
                System.out.print("Enter the size of matrix:");
                try (Scanner in = new Scanner(System.in)) {
        			int N = in.nextInt(); 

            System.out.print("Det is : "+ determinantOfMatrix(a, N));
        }
    }
}
