package DSA.Algorithm.sorting_and_searching.BinarySearch;
// last and first occurrences
public class q1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 8, 8};
        int k = 1;
        System.out.println(firstOccurences(arr, k));
        System.out.println(lastOccurences(arr,k));
        System.out.println(countOccurences(arr, k));
    }
    static int lastOccurences(int[] arr,int k) {
        int l = 0,r = arr.length-1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if(k < arr[m]){
                r = m-1;
            }else if(k > arr[m]){
                l = m+1;
            }else {
                l = m+1;
                ans = m;
            }
        }
        return ans;
    }
    static int firstOccurences(int[] arr,int k) {
        int l = 0 , r = arr.length-1;
        int ans = -1;
        while (l <= r){
            int m = l + (r-l)/2;
            if(k < arr[m]){
                r = m-1;
            } else if (k > arr[m]) {
                l = m+1;
            }else {
                r = m-1;
                ans = m;
            }
        }
        return ans;
    }
    static int countOccurences(int[] arr , int k) {
        int first = firstOccurences(arr,k);
        int last = lastOccurences(arr,k);
        if(first == -1) return 0;
        return ((last - first)+1);
    }
}
