package pratice_section.Array_QUS;
import java.util.*;
// find diff .
public class Q13 {
    public static void main(String[] args) {
        int[] arr = {2 ,2 ,3 ,8 ,10 ,12 ,17 ,21 ,23 ,24 ,28 ,30 ,35 ,39 ,39 ,43 ,44 ,48 ,49 ,
                59 ,61 ,62 ,69 ,69 ,77 ,79 ,79 ,83 ,84 ,84 ,92 ,95 ,96 ,97 ,100};
        System.out.println(checkDiff(arr,31));
        System.out.println(findDifference(arr,31));

    }
    public static boolean checkDiff(int[] arr , int k){
        for (int i = 0;i< arr.length-1;i++){
            if (arr[i+1]-arr[i] == k){
                return true;
            }
        }
        return false;
    }
    public static boolean findDifference(int[] arr, int k) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num - k) || seen.contains(num + k)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}
