package DSA.Algorithm.Backtracking;

import java.util.ArrayList;

// Rate in Maze problem .

public class Q2 {
    public static void main(String[] args) {
        //You can code here
        int[][] arr = {
                { 1 , 0, 0, 0 },
                { 1 , 1, 0, 1 },
                { 1 , 1, 0, 0 },
                { 0 , 1, 1, 1 }
        };
        int n = arr.length;
        ArrayList res = new ArrayList<>();
        boolean vis[][] = new boolean[n][n];
        vis[0][0] = true;
        System.out.println(rateInMaze(arr,vis,0,0,"",n,n ,res));

    }
    static boolean isValid(int i , int j ,boolean vis[][] , int mat[][] ,int n , int m){
        if(i < n && i >= 0 && j < m && j >= 0 && mat[i][j] == 1 && !vis[i][j]){
            return true;
        }
        return false;
    }

    static ArrayList<String> rateInMaze(int[][] mat, boolean[][] vis, int i , int j, String path , int n , int m, ArrayList<String> res){

        if(i==n-1 && j==m-1){
            if(res.contains(path)){
                return res;
            }
            res.add(path);
            return res;
        }
        if(isValid(i+1,j,vis,mat,n,m)){
            vis[i+1][j]=true;
            rateInMaze(mat , vis ,i+1, j ,path+'D',n,m , res);
            vis[i+1][j] = false;
        }
        if(isValid(i,j-1,vis,mat,n,m)){
            vis[i][j-1]=true;
            rateInMaze(mat , vis ,i , j-1 ,path+'L',n,m ,res);
            vis[i][j-1] = false;
        }
        if(isValid(i,j+1,vis,mat,n,m)){
            vis[i][j+1]=true;
            rateInMaze(mat , vis ,i , j+1 ,path+'R',n,m,res);
            vis[i][j+1] = false;
        }
        if(isValid(i-1,j,vis,mat,n,m)){
            vis[i-1][j]=true;
            rateInMaze(mat , vis ,i-1 , j ,path+'U',n,m ,res);
            vis[i-1][j] = false;
        }
        return res;
    }
}
