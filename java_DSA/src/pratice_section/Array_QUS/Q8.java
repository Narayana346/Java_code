package pratice_section.Array_QUS;
import java.util.*;
// Maximum absolute difference .
public class Q8 {
    public static void main(String[] args) {
        int[] arr = {12,9,8,2,11,5,4,5};
        System.out.println(max_mum_Diff(arr));
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int item:arr){
            arr2.add(item);
        }
        System.out.println(maxArr(arr2));
    }
    public static int max_mum_Diff(int a[]){
        int n = a.length;
        int aipi[] = new int[n];
        int aimi[] = new int[n];
        for (int i = 0;i<n;i++){
            aipi[i] = a[i] + i;
            aimi[i] = a[i] -i;
        }

        int minaipi = Integer.MAX_VALUE;
        int maxaipi = Integer.MIN_VALUE;

        int minaimi = Integer.MAX_VALUE;
        int maxaimi = Integer.MIN_VALUE;

        for (int e : aipi){
            minaipi = Math.min(minaipi ,e);
            maxaipi = Math.max(maxaipi,e);
        }
        for (int e : aimi){
            minaimi = Math.min(minaimi ,e);
            maxaimi = Math.max(maxaimi,e);
        }

        int diffaipi = maxaipi - minaipi;
        int diffaimi = maxaimi - minaimi;

        return Math.max(diffaipi,diffaimi);
    }
    public static int maxArr(ArrayList<Integer> A) {
        //You can code here
        int n = A.size();
        int minaipi = Integer.MAX_VALUE;
        int maxaipi = Integer.MIN_VALUE;

        int minaimi = Integer.MAX_VALUE;
        int maxaimi = Integer.MIN_VALUE;

        for (int i = 0;i<n;i++){
            minaipi = Math.min(minaipi ,A.get(i)+i);
            maxaipi = Math.max(maxaipi ,A.get(i)+i);

            minaimi = Math.min(minaimi,A.get(i)-i);
            maxaimi = Math.max(maxaimi,A.get(i)-i);
        }

        int diffaipi = maxaipi - minaipi;
        int diffaimi = maxaimi - minaimi;

        return Math.max(diffaipi,diffaimi);
    }
}
