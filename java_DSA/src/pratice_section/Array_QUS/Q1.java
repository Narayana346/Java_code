package pratice_section.Array_QUS;

// sliding - window Algorithm approach.
// maximum sum of sub array.
public class Q1 {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1,2,3,4,9,8,5};
        int[] res = new int[k];

        int result = maxSumOfSubArray(arr,k,res);
        for (int item :
                res) {
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.print(result);

    }
    static int maxSumOfSubArray(int[] arr,int k,int[]res){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while (j<arr.length){
            if(j-i+1 <= k){
                sum += arr[j];
                if (sum > max){
                    max = sum;
                    giveArray(arr,res ,i,k);
                }
                j++;
            }else {
                sum += arr[j];
                sum -= arr[i];
                j++;
                i++;
                if (sum > max){
                    max = sum;
                    giveArray(arr,res,i,k);
                }

            }
        }

        return max;
    }
    static void giveArray(int[] arr,int[]res ,int start ,int k){
        for (int i = 0 ;i < k;i++){
            res[i] = arr[start];
            start++;
        }
    }
}
