package DSA.Algorithm.Backtracking;
// knight's tour problem.
public class Q5 {
    public static void main(String[] args) {
        int n = 5;
        int arr[][] = knightTour(n);
       for (int i = 0;i< n;i++){
           for (int j = 0;j < n;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
    }
    static int[][] knightTour(int n){
        int arr[][] = new int[n][n];
        for (int i = 0;i<n;i++){
            for (int j =0;j<n;j++){
                arr[i][j] =-1;
            }
        }
        arr[0][0] = 0;
        int moveX[] ={2,1,-1,-2,-2,-1,1,2};
        int moveY[] ={1,2,2,1,-1,-2,-2,-1};
        boolean check = knightsTourHelper(n,arr,moveX,moveY,0,0,1);
        if (!check){
            arr[0][0] = -1;
        }
        return arr;
    }

    static boolean knightsTourHelper(int n,int a[][],int movesX[], int movesY[],
                                  int curX,int curY , int step){
        if (step == n*n) return true;

        for (int i = 0;i < 8;i++){
            int nextX = curX+movesX[i];
            int nextY = curY+movesY[i];
            if (isValid(n,a,nextX,nextY)){
                a[nextX][nextY] = step;
                boolean isTourComplete = knightsTourHelper(n,a,movesX,movesY,nextX,nextY,step+1);
                if(isTourComplete){
                    return true;
                }else {
                    a[nextX][nextY] = -1; // backtracking
                }
            }
        }
        return false;
    }
    static boolean isValid(int n , int a[][],int x, int y){
       return  (x >= 0 && y >=0 && x < n && y < n && a[x][y] == -1);
    }

}
