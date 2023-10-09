package DSA.Data_structure.listDataStructure.MyArraylist.problem.Easy;

import java.util.ArrayList;
import java.util.Scanner;

/*
printing the size of the arr by removing minimum_value_of-duplicate in an array_length is not equal Zero.
like test-case - {5,4,4,2,2,8}
{5,4,4,2,2,8} size-6 and min-2 remove.
{5,4,4,8} size-4 and min-4 remove.
{5,8} size-2 and min-5 remove.
{8} size-1 and remove-8.
{} size-0.

output --> print size of array --> con(size>0 the print).
like print --> 6 , 4, 2, 1
* */
public class q1 {
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
                    newArr.add(num);
                }
            }
            if (newArr.size()>0) System.out.println(newArr.size());
            arr = newArr;
            System.out.println(newArr);
        }
    }
}
