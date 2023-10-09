package pratice_section.Array_QUS;

import java.util.*;

//
public class Q19 {
    public static void main(String[] args) {
     int[] arr = {1,3,2,4,1,6,7,8,};
     int[] check = Arrays.copyOf(arr, arr.length);
     Arrays.sort(check);
     int n = arr.length;
     int i = 0;
     int j = n-1;
        ArrayList<Integer> res = new ArrayList<Integer>();
     for (int k = 0 ; k < n ; i++ ,k++ ){
         if (check[k] != arr[i]){
             res.add(i);
             break;
         }

        }
     for (int k = n-1 ;k>=0 ; k--){
         if (check[k]!= arr[j]){
             res.add(j);
             break;
         }
         j--;
     }
     System.out.println(res);

     ArrayList<Integer> ex1 = new ArrayList<Integer>();
        for (int item : arr) {
            ex1.add(item);

        }
//        Collections.sort(ex1);
        System.out.println(subsorted(ex1));
    }

    public static List<Integer> subsorted(List<Integer> A){
        List<Integer> res = new ArrayList<Integer>();
        List<Integer> check = new ArrayList<>(A);
        Collections.sort(check);
        if (A.equals(check)){
            res.add(-1);
            return res;
        }
        for (int i = 0; i < A.size()-1 ; i++){
            if (A.get(i) != check.get(i)){
                res.add(i);
                break;
            }
        }
        for (int j = A.size()-1; j >= 0; j--){
            if (A.get(j) != check.get(j)){
                res.add(j);
                break;
            }
        }
        return res;
    }

}
