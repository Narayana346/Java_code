package DSA.Algorithm.Recursion;
// printing pascal triangle ...
public class Q7 {
    public static void main(String[] args) {

        for (int i = 0 ;i<=5;i++){
            for (int j = 5-i;j>=0;j--){
                System.out.print(" ");
            }

            for (int j = 0;j<=i;j++){
                System.out.print(nCR(j,i)+" ");
            }
            System.out.println();
        }


    }
    static int nCR(int n ,int r){
        if (n==0 || n==r){
            return 1;
        }
        return nCR(n-1 , r-1 ) + nCR(n-1 , r );
    }

}
