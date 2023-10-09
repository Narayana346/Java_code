package pratice_section.Array_QUS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Wave Array.
public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,8,6,5,9};
        int[] arr2 = {1,3,2,4,8,6,5,9};
        ArrayList<Integer> arr3  = new ArrayList<>();
        waveArray(arr);
        for (int item:
             arr) {
            arr3.add(item);
            System.out.print(item+" ");
        }
        System.out.println();
        waveArrayNotLexicographical(arr2);
        for (int item:
                arr2) {
            System.out.print(item+" ");
        }
        System.out.println();
        waveArray_list(arr3);
        System.out.println(arr3);

    }
    // time complexity O(NlogN)
    static void waveArray(int[] arr){
        Arrays.sort(arr); // lexicographical .
        for (int i = 1;i<arr.length;i = i+2){
            swap(arr,i,i-1);
        }
    }
    static void waveArray_list(ArrayList<Integer> arr){
        Collections.sort(arr); // lexicographical .
        for (int i = 1;i<arr.size();i = i+2){
            swap_arrayList(arr,i,i-1);
        }
    }
    // time complexity O(N).
    static void waveArrayNotLexicographical(int[] arr){ 
        for (int i = 1;i < arr.length;i+=2){
            if (arr[i] > arr[i-1]){
                swap(arr,i,i-1);
            }
            if(i < arr.length-1 && arr[i] > arr[i+1]){
                swap(arr,i,i+1);
            }
        }
    }
    static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void swap_arrayList(ArrayList<Integer> arr, int i , int j){

        int temp = arr.get(i);
        arr.set(i , arr.get(j));
        arr.set(j,temp);
    }
}
