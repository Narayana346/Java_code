package DSA.Data_structure.listDataStructure.MyArraylist.problem.Easy;

import java.util.*;

//find the index of two element sum is target number.
public class q2 {
    public static void main(String[] args) {
        int[] arr = {2,8,6,3,4,5,6,9,0,2,7,8,1};
        int target = 12;
        List<int[]> result = findTwoSum(arr,target);
        System.out.print("{ ");
        for (int[] array : result){
            System.out.print(Arrays.toString(array));
            System.out.print(", ");
        }
        System.out.print(" }");
    }
    private static List<int[]> findTwoSum(int[] arr , int target){
        List<int[]> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(target - arr[i])){
                int[] arr1 = { map.get(target - arr[i]) , i };
                result.add(arr1);
            }
            map.put(arr[i], i);
        }

        return result;
    }
}
