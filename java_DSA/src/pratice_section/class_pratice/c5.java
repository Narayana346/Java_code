package pratice_section.class_pratice;

public class c5 {
    public static void main(String[] args) {
        int res  = nTHfibo(10000000);
        System.out.println(res);

    }
    public static int nTHfibo(int num){
        if (num == 0) return 0;
        int a = 0 , b = 1;
        int mod = (int)1e9+7;
        num = num-2;
        while (num>=0){
            int c = (a%mod+b%mod)%mod;
            a= b;
            b = c;
            num--;
        }

        return b;
    }
}
