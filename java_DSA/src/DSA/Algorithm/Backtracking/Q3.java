package DSA.Algorithm.Backtracking;

// permutation of an Array .

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        permutationOfArray(arr , 0 , arr.length-1);
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        res =  permutationOfArray(arr,0, arr.length-1,res);
        Collections.sort(res, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return 0;
        });
        System.out.println(res.size());
        System.out.print(res);

    }
    static void permutationOfArray(int[] arr ,int l , int r){
        if (l==r){
            printArray(arr);
            return;
        }
        for (int i = l;i<=r;i++){
            swap(arr ,i ,l);
            permutationOfArray(arr ,l+1,r);
            swap(arr ,i , l); // backtracking.
        }
    }
    static List<List<Integer>> permutationOfArray(int[] arr , int l , int r , List<List<Integer>> res){
        if (l==r){
            ArrayList<Integer> add = new ArrayList<>();
            for (int item:
                 arr) {
                add.add(item);
            }
            res.add(add);
            return res;
        }
        for (int i = l;i <= r;i++){
            swap(arr ,i ,l);
            permutationOfArray(arr ,l+1,r,res);
            swap(arr ,i , l); // backtracking.
        }
        return res;
    }
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int[] arr){
        for (int item :
                arr) {
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
