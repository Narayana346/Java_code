package pratice_section.class_pratice;

public class c3 {
    public static void main(String[] args) {
       int num =1001;
       String str = "madam";
       if (isPalindrome_string(str))System.out.println("palindrome");
        else System.out.print("not palindrome");

        if (isPalindromeInteger(num))System.out.println("palindrome");
        else System.out.print("not palindrome");

    }
    static int[] Bubble_sort( int[]array){

        boolean swapped ; // this for optimisation
        for(int i = 0 ; i < array.length-1 ; i++ ){
            swapped = false;
            for (int j = 0 ; j < array.length-i-1 ; j++ ){
                if (array[j] > array[j+1]){
//                    array[j] = array[j] ^ array[j+1] ^ (array[j+1] = array[j]); // swap the variable
                    swap(array,j,j+1);
                    swapped = true;

                }
            }
            if (!swapped) break;
            /* in this line break the outer loop
             when not swap in an inner loop
             that means the array was sorted then simply break the loop . */
        }
        return array;
    }
    static void swap (int[] array,int i , int j ){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static boolean isPalindrome_string(String str){
        int left = 0,right = str.length()-1;
        boolean check = true;
        while(left<right){
            if (str.charAt(left) != str.charAt(right)){
                check = false;
            }
            left++;
            right--;
        }
        return check;
    }
    static boolean isPalindromeInteger(int num){
        boolean check = false;
        int checkInt = num;
        int res = 0;
        while (num>0){
            int rim = num%10;
            res  =(res*10)+rim;
            num = num/10;
        }
        if (checkInt == res){
            return check = true;
        }
        return check;
    }
}
