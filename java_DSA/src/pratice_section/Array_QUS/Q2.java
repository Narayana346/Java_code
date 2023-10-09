package pratice_section.Array_QUS;

// rotate k time array.
public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] rot = {2,3};
//        rotate(arr,2);
//        for(int item:arr){
//            System.out.print(item+" ");
//        }
//        System.out.println();
        int[][] ans = multipleRotations(arr2,rot);
        for (int[] item : ans){
            for (int val: item) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
//    O(N*M) time complexity.
    public static void rotate(int[] arr , int k){
        while(k>0){
            int i = 0;
            int temp = arr[i];
            for(int j = 1;j< arr.length;j++){
                arr[i] = arr[j];
                i++;
            }
            arr[arr.length-1] = temp;
            k--;
        }
    }

    public static int[][] multipleRotations(int[] arr,int[]arr2){
        int n = arr.length;
        int m = arr2.length;
        int[][] ans = new int[m][n];
        int[] temp = new int[2*n];
        for (int i = 0;i<n;i++){
             temp[i] = arr[i];
             temp[i+n] = arr[i];
        }
        for (int i =0;i<m;i++){
            int offset = (arr2[i])%n;
            for (int j = 0;j<n;j++){
                ans[i][j] = temp[j+offset];
            }
        }

        return ans;
    }
}
