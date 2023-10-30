package DSA.Algorithm.sorting_and_searching.BinarySearch;
//find the upper and lower bounds
public class q2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,3,3,4,4,8,12};
        int k = 4;
        System.out.println(upperBound(arr, k));
        System.out.println(lowerBound(arr, k));

    }
    static int upperBound(int[] arr, int k){
        int l =0,r = arr.length-1;
        int ans = arr.length;
        while (l <= r){
            int m = l + (r -l)/2;
            if( k < arr[m] ){
                ans = m;
                r = m-1; // left
            } else if (k >= arr[m] ){
                l = m+1; // right
            }
        }
        return ans;
    }
    static int lowerBound(int[] arr, int k){
        int l = 0,r = arr.length-1;
        int ans = -1;
        while (l <= r){
            int m = l + (r-l)/2;
            if(k <= arr[m]){
                r = m-1; //left
            }else if(k > arr[m]){
                ans = m;
                l = m+1; //right
            }
        }
        return ans;
    }
}
