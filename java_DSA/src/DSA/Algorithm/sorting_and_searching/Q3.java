package DSA.Algorithm.sorting_and_searching;
//Q --> allocate the book to read the maximum pages to
// the n number of the student .
// the optimising solution is O(NlogN) . and use the binary search .
// the bruteforce solution is O(2^n)  .
/*      -------> Rule of the Binary search <-----       */
/* Basically the binary search is applicable for the sorted array.
*  and it applicable for the allocation for continue order .*/
public class Q3 {
    static  int maxPages(int[] array , int no_student){
        int min = maxOf(array);
        int max = sumOf(array);
        int res = 0;
        if (array.length < no_student)return  -1 ;
        while (max >= min){
            int mid = (min+max)/2;
            if(isFeasible(array,no_student,mid)){
                res = mid;
                max = mid-1;
            }else {
                min = mid+1;
            }
        }
        return res;
    }
    static boolean isFeasible(int[] array , int std , int res){
        int student = 1 , sum =0;
        for (int j : array) {
            if (sum + j > res) {
                student++;
                sum = j;
            } else {
                sum += j;
            }
        }
        return student <= std;
    }
    static  int maxOf(int[] array){
        int max = 0;
        for(int i = 0; i< array.length-1; i++){
            if (array[i]>max) max = array[i];
        }
        return max;
    }
    static  int sumOf( int[] array){
        int sum = 0;
        for (int item:array
             ) {
            sum += item;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array = {12, 34, 67, 90};
        int no_student = 2;
        int maxPages = maxPages(array,no_student);
        System.out.println("the maximum Pages is "+ maxPages);
    }
}
