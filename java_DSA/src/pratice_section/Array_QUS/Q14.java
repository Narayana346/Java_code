package pratice_section.Array_QUS;

import java.util.Arrays;

// minimum operation to make all element of matrix equal .
public class Q14 {
    public static void main(String[] args) {
        int arr[][] = {
                {628, 550, 934, 955, 239, 454},
                {674, 198, 318 ,320 ,711 ,748},
                {381 ,329 ,811, 65 ,913 ,222},
                {28 ,688 ,852 ,779 ,306 ,954},
                {838, 567 ,658, 52 ,664 ,370},
                {707 ,665 ,692 ,130 ,411 ,983},
                {345 ,658 ,320 ,585 ,578 ,775},
                {775 ,302 ,136, 436, 67 ,592},
                {47 ,615, 658, 7 ,693 ,581},
        };
        int k = 77;

       System.out.println( makeMatrixEqual(arr,k));

    }
    static int makeMatrixEqual(int arr[][] , int k){
        int n  = arr.length;
        if (n == 0) return 0;
        int m = arr[0].length;
        int total = n*m;
        int[] b = new int[total];

        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                b[i*m + j] = arr[i][j];
            }
        }
        Arrays.sort(b);
        int median = b[total/2];
//       check for operation of every element.
//        for (int i = 0;i<total;i++){
//            System.out.println(b[i]+" "+ makeMatrixEqualHelper(b,b[i],k));
//        }

        return makeMatrixEqualHelper(b,median,k);
    }
    static int makeMatrixEqualHelper(int[] b , int m , int k){
        int count = 0;
        for (int i = 0;i<b.length;i++){
          count +=  Math.abs(b[i]- m)/k;
        }
        return count;
    }
}
