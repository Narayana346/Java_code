package DSA.Algorithm.sorting_and_searching;


public class All_SearchIng_Algo {
    static int linear_search(int[] array , int key){
        // the time complexity is O(N) .
        // the space complexity is O(1) .
        int n =array.length;
        for(int i =0; i<n ; i++){
            if(key == array[i]) return i;
        }
        return -1;
    }
    static int Binary_search(int[] array, int key){
        /*   array must be sorted .
         *   find mid index : mid = ( low_index + High_index)/2.
         *   if a[mid] == kEY , RETURN mid .\
         *   if key > a[mid] , repeat --> low = mid+1 and search right side .
         *   if key < a[mid] , repeat --> low = mid-1 and search left side .
         *   */
            int Low = 0;
            int High =array.length;
            while (Low <= High ){
                int mid = (Low + High)/2;
                if (array[mid] == key){
                    return mid;
                }else if (key > array[mid]){
                    Low = mid+1;
                }else High = mid-1;
            }
        return -1 ;
    }
    static int Binary_search_BY_recursion(int[] array,int Low , int High , int key){
            if (Low > High )return -1;
                int mid = (Low + High)/2;
                if (array[mid] == key) return mid;

                if (key > array[mid])
                return Binary_search_BY_recursion(array,mid+1 , High,key);

         return Binary_search_BY_recursion(array, Low,mid-1,key);
    }
    public static int jumpSearch(int[] arr, int key) {
        // the time complexity is O(√ N) .
        // the space complexity is O(1) .
        /*
        * Works only sorted arrays.
        * The optimal size of a block to be jumped is (√ n). This makes the time complexity of Jump Search O(√ n).
        *The time complexity of Jump Search is between Linear Search ( ( O(n) ) and Binary Search ( O (Log n) ).
        * Binary Search is better than Jump Search, but Jump search has an advantage that we traverse back
            only once (Binary Search may require up to O(Log n) jumps,consider a situation where the element to be
            searched is the smallest element or smaller than the smallest). So in a system where binary search is costly, we use Jump Search.*/
                int n = arr.length;

        // Finding block size to be jumped
        int step = (int)Math.floor(Math.sqrt(n));

        // Finding the block where element is
        // present (if it is present)
        int prev = 0;
        while (arr[Math.min(step, n)-1] < key)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        // Doing a linear search for key in block
        // beginning with prev.
        while (arr[prev] < key)
        {
            prev++;

            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }

        // If element is found
        if (arr[prev] == key)
            return prev;

        return -1;
    }

    static int[] insertion_sort( int[]array){
        /* 1. the time complexity is O(N^2) .
           2. the space complexity is O(1) .
        */
        for(int i = 0 ; i < array.length ; ++i ){
            int key = array[i];
            int j = i - 1;
            while ( j >= 0 && array[j]>key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j + 1] = key;
        }
        return array;
    }
    static void print_Array(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {8,5,4,9,1,0,12,16};
        insertion_sort(array);
        print_Array(array);
       System.out.println( "the search number index is "+(linear_search(array,9)+1));
       System.out.println( "the search number index is "+(Binary_search(array,9)+1));
       System.out.println( "the search number index is "+(Binary_search_BY_recursion(array,0,array.length,9)+1));

    }
}
