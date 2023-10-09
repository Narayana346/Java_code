package pratice_section.class_pratice;

import java.util.ArrayList;
import java.util.Scanner;

public class c6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(scanner.nextInt());
        }
        System.out.println(arr);
        System.out.println(arr.size());
        printArrayAfterDecrease(arr);
    }

    public static void printArrayAfterDecrease(ArrayList<Integer> arr) {
        while (!arr.isEmpty()) {
            int minVal = Integer.MAX_VALUE;
            for (int num : arr) {
                minVal = Math.min(minVal, num);
            }

            ArrayList<Integer> newArr = new ArrayList<>();
            for (int num : arr) {
                if (num > minVal) {
                    newArr.add(num - minVal);
                }
            }
            if (newArr.size()>0) System.out.println(newArr.size());

            arr = newArr;
//            System.out.println(newArr);
        }
    }
}