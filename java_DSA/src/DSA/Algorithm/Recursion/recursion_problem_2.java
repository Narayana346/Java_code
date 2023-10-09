package DSA.Algorithm.Recursion;

//foldFill of matrix
public class recursion_problem_2 {
    public static void main(String[] args){
        recursion_problem_2 print = new recursion_problem_2();

       int[][] mat;
               mat =new int[][]{
                       {2, 2, 0, 2},
                       {2, 0, 2, 2},
                       {2, 0, 2, 2},
                       {0, 2, 2, 2}
               };
        print.printMatrix(mat);
        System.out.println("After the filled");
        floodFill(mat,2,2,7,2);
        print.printMatrix(mat);

    }
    static void floodFill(int[][] a, int r, int c, int toFill, int prevFill){
        int rows =  a.length;
        int col = a[0].length;
        if (r < 0 || r >= rows|| c < 0 || c >= col){
            return;
        }
        if (a[r][c] != prevFill){
            return;
        }
        a[r][c] = toFill;
        floodFill(a,r-1,c,toFill,prevFill);
        floodFill(a,r,c-1,toFill,prevFill);
        floodFill(a,r+1,c,toFill,prevFill);
        floodFill(a,r,c+1,toFill,prevFill);
    }    public static int countDigits(int n){
        // Initializing 'cur' and 'ans'.
        int cur = n, ans = 0;
        // Iterating while 'cur' > 0.
        while (cur > 0)
        {
            // 'd_0' gives us the digit at 'ones' place decimal notation of 'cur'.
            int d_0 = cur % 10;
            if (d_0 != 0)
            {
                // Incrementing 'ans' by 1 if current digit divides 'n' evenly.
                ans += ((n % d_0) == 0)?1:0;
            }
            cur /= 10;
        }
        return ans;
    }


    void printMatrix(int[][] mat){
        for (int i = 0; i< mat.length;i++){
            for (int j = 0;j <mat[0].length;j++){
                System.out.print( mat[i][j] +" " );
            }
            System.out.println();
        }
    }

}
