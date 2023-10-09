package pratice_section.Array_QUS;

import java.util.Arrays;
import java.util.Vector;

// missing and repeating numbers.
public class Q22 {
    public static void main(String[] args) {
        int[] arr = {38 ,51 ,9 ,47 ,3 ,45 ,72 ,46 ,30 ,23 ,13
                    ,39 ,52 ,80 ,70 ,39 ,14 ,75 ,62 ,29 ,55
                    ,78 ,17 ,73 ,67 ,42 ,60 ,10 ,7 ,24 ,50
                    ,26 ,20 ,61 ,33 ,76 ,2 ,21 ,16 ,15 ,22
                    ,32 ,43 ,18 ,41 ,28 ,79 ,48 ,68 ,36 ,12
                    ,27 ,54 ,49 ,6 ,34 ,64 ,31 ,53 ,19 ,57
                    ,58 ,74 ,40 ,44 ,63 ,59 ,37 ,69 ,5 ,8
                    ,1 ,77 ,11 ,25 ,4 ,71 ,65 ,66 ,56};

      Vector<Integer> Result = missingNumber(arr);
      System.out.println(Result);
    }
    public static Vector<Integer> missingNumber(int[] a) {
        Vector<Integer> result = new Vector<>();
        int size = a.length;
        int[] check = new int[size+1];
        int repeating = 0, missing = 0;
        for(int i = 0 ; i < size ;i++){
            check[a[i]]++;
        }
        for (int i = 1;i<size;i++){
            if(check[i] > 1){
                repeating = i;
            }
            if(check[i] == 0){
                missing = i;
            }
        }
        result.add(new Integer(missing));
        result.add(new Integer(repeating));
        return result;
    }
}
