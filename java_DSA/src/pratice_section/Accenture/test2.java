package pratice_section.Accenture;
import java.util.*;
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1 ");
        int num1 = sc.nextInt();
        System.out.println("enter the num2 ");
        int num2 = sc.nextInt();
        int res = sol(num1,num2);
        System.out.println(res);
    }
    static int sol(int num1, int num2) {
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            if (i % num2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
