package DSA.Algorithm.sorting_and_searching;

import java.util.ArrayList;

public class All_Sorting_Algo {
    static int[] Merge_sort(int[] array , int l , int r ){
        /*
        * the time complexity is the O(NlogN) in all cases
        *  the space complexity is the O(N)
        * it is much more the stable by the Quick sort and
        * typical implementation of divide and conquer algo
        *  */
        if( l < r ){
            int mid  = (l+r)/2;
            Merge_sort(array , l , mid );
            Merge_sort(array , mid+1 , r );
            merge(array,l,mid,r);
        }
        return array;
    }
    static int[]  Quick_sort(int[] array , int Low , int High){
        //the bast case time complexity is O(NlogN) and the wost case is O(N^2)
        // space complexity is O(N)
        /* low  --> Starting index,  high  --> Ending index */
        if (Low < High){
            /* pi is partitioning index, arr[pi] is now at right place */
            int pivot = partition(array,Low,High);
            Quick_sort(array,Low,pivot-1); //Before pivot
            Quick_sort(array,pivot+1,High); //After pivot
        }
        return array;
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
    static int[] Bubble_sort( int[]array){
        /* 1. the time complexity is O(N*N) .
           2. the space complexity is O(1) .
           3. the time and space also same of the selection sort but
           the inner loop is run when swap the element
           it is more optimise of the selection sort .
           */
        boolean swapped ; // this for optimisation
        for(int i = 0 ; i < array.length-1 ; i++ ){
            swapped = false;
            for (int j = 0 ; j < array.length-i-1 ; j++ ){
                if (array[j] > array[j+1]){
//                    array[j] = array[j] ^ array[j+1] ^ (array[j+1] = array[j]); // swap the variable
                   swap(array,j,j+1);
                    swapped = true;

                }
            }
            if (!swapped) break;
            /* in this line break the outer loop
             when not swap in an inner loop
             that means the array was sorted then simply break the loop . */
        }
        return array;
    }
    static int[] Selection_Sort(int[] array){
      // time complexity is O(N*N);
      //the space complexity is O(1)
        for (int i = 0 ; i  < array.length - 1 ; i++ ){
            for ( int j = i+1 ; j < array.length ; j++ ){
                if (array[i] > array[j]){
                  swap(array,i,j);
                }
            }
        }
        return array;
    }
    static void print_Array(int[] array){
        for (Object j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    static int partition(int[] array , int Low , int High){
        int pivot = array[High];
        int i = (Low -1) ;
      for(int j = Low ; j <= (High - 1) ; j++ ){
          if (array[j] <= pivot){
              i++;
              swap(array,i,j);
          }
      }
       swap(array,i+1,High);
        return (i+1);
    }
    static void swap (int[] array,int i , int j ){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static  void merge(int[] array, int l , int mid, int r ){
        // Find sizes of two sub arrays to be merged
        int n1 = mid - l + 1; // the length of the left side sub_array
        int n2 = r - mid;     // the length of the right side sub_array

        /* Create temp arrays */
        int[] Left = new int[n1];
        int[] Right  = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            Left[i] = array[l + i];
        for (int j = 0; j < n2; ++j)
            Right[j] = array[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second sub arrays
        int i = 0, j = 0;

        // Initial index of merged sub arrays
        int k = l;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                array[k] = Left[i];
                i++;
            }
            else {
                array[k] = Right[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of Left[] if right array is exhaust */
        while (i < n1) {
            array[k] = Left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of Right[] if left array is exhaust  */
        while (j < n2) {
            array[k] = Right[j];
            j++;
            k++;
        }

    }
    static  public void rotate(int arr[], int n) {

        // in this algo the time complexity is O(N). and the space complexity is O(1) .

        for(int i = 0 ; i<(n-1)/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-2-i];
            arr[n-2-i] = temp;
        }
        for(int j = 0; j<n/2;j++ ){
            int temp2 = arr[j];
            arr[j] = arr[n-1-j];
            arr[n-1-j] = temp2;
        }
    }
   static int doUnion(int[] a , int n , int[] b , int m) {
        //Your code here
        ArrayList<Integer> res = new <Integer> ArrayList();
        for (int i= 0; i<n ;i++){
            if(!res.contains(a[i])){
                res.add(a[i]);
            }
        }
        for (int j= 0; j<m ;j++){
            if(!res.contains(b[j])){
                res.add(b[j]);
            }
        }
        int count = res.size();
//        print_Array(res);
       System.out.println();
        return count;

    }    // this is the part of the merge_sort



    public static void main(String[] args) {
        int[] array = {21,8,19,23,17,7,18,14};
        int n = array.length;
//        int[] arr2 = {5,5};
//        int m =arr2.length;
//       Selection_Sort(array);
//       Bubble_sort(array);
//        insertion_sort(array);
//        Quick_sort(array,0, n-1);
//        Merge_sort(array,0,n-1);
        rotate(array , 3);
        print_Array(array);
//    System.out.println(doUnion(array , n , arr2, m));
    }
}
