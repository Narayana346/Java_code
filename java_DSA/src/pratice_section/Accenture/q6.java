package pratice_section.Accenture;

public class q6 {

    public static void main(String[] args) {
        int res = sum(100,160);
        System.out.println(res);

    }
    public static int sum(int n,int m){
        int sum = 0;
        for (int i = n;i < m;i++){
            if (i%3 == 0 && i%5 ==0){
                sum += i;
            }
        }
        return sum;
    }

}
