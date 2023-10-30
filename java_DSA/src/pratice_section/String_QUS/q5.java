package pratice_section.String_QUS;

import java.util.*;

public class q5 {
    public static void main(String[] args) {
        int[] arr = {11,12,23,14,1,2,5,8,2,1,3};
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < arr.length-1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                max = Math.max(max, arr[j]);
            }
            if(res.isEmpty()) {
                res.add(max);
            } else if(res.get(res.size()-1)==max){
                    res.remove(res.size()-1);
                    res.add(max);
            }else{
                    res.add(max);
            }

        }
        System.out.println(res);
    }
}
