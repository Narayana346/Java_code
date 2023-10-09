package DSA.Algorithm.sorting_and_searching;
// Q ---> find the element in an infinite sorted array
public class Q1 {
    static int searchInfinite(int[] array , int key){
        int low = 0;
        int high = 1;
        while (array[high]<key){
            low = high;
            high = 2*high;
            /* in this given expression is to do time complexity is O(logN) .
            * due to the method is growth is exponential of (2^k).*/
        }
        return Binary_search_BY_recursion(array,low,high,key);
    }
    static int Binary_search_BY_recursion(int[] array,int Low , int High , int key){
        if (Low > High )return -1;
        int mid = (Low + High)/2;
        if (array[mid] == key) return mid;

        if (key > array[mid])
            return Binary_search_BY_recursion(array,mid+1 , High,key);

        return Binary_search_BY_recursion(array, Low,mid-1,key);
    }
    // the above method the time complexity is O(logN)
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
    }



    public static void main(String[] args) {
        int[] array = {8,9,0,5,8,45,2,3,78,6,89,80,86,45,80,95,45,78,15,16,14,78,58,13,17,19,1,8,90,46,48,4,7,60};
        insertion_sort(array);
        print_Array(array);
        int index = searchInfinite(array,86);
        System.out.println("the index of the key --> "+(index));

    }
}
