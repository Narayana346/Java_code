package DSA.Algorithm.Bit_Manipulation;
// all bits operations.
public class Q4 {
    public static void main(String[] args) {
        int n = 724;
        int i = 2;
        int j = 6;
        System.out.println(clearBitsGivenRange(n, i, j));
    }
    public static int getIthBits(int n, int i){
        int mask = 1<<i;
        return ((n & mask) == 0 ? 0 : 1);
    }

    public static int setIthBits(int n, int i){
        int mask = 1<<i;
        return (n|mask);
    }

    public static int clearIthBits(int n , int i){
        int mask = ~(1<<i);
        return n & mask;
    }

    public static int clearBitsGivenRange(int n ,int i , int j){
        int a = (~0 <<(j+1));
        int b = (1<<i)-1;
        int mask = a|b;
        return (n & mask);
    }

}
