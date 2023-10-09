package java_basic;

public class practice {
    public static void main(String[] args) {

        System.out.println(sumFirstN(5));
        String str = "A man, a plan, a canal: Panama";

    }
    public static long sumFirstN(long n) {
        // Write your code here.

        if(n == 1){
            return 1;
        }

        long sum = sumFirstN(n-1);
        return  sum;
    }

}
