package pratice_section.Accenture;

public class q4 {
    public static void main(String[] args) {
        int[] arr = {5 ,4 ,2 ,3 ,9 ,1 ,7};
        int sum = 9;
        int res = uniqpro(arr ,sum);
        System.out.println(res);

    }
    public static int uniqpro(int[] arr , int sum){
        if (arr.length < 2) return -1;
        int fir = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for (int i = 0;i< arr.length;i++){
            if (arr[i]<fir){
                sec = fir;
                fir = arr[i];
            }else if(sec > arr[i] && arr[i] != fir){
                sec = arr[i];
            }
        }
        if(sum >= fir+sec) {
            return fir * sec;
        }

        return 0;
    }
}
