package pratice_section.Accenture;

public class q9 {
    public static void main(String[] args) {
        int[] val = {1,1,45};
        int[] wt = {2,1,3};
        int N = val.length;
        int w = 3;
        System.out.println(knapSack(N, w, val, wt));

    }
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0;i<N;i++){
                min = wt[i];
                res = Math.max( ((W/wt[i])*val[i]),res);
        }
        return res;
    }
}
