package DSA.Algorithm.Recursion;

// Java program for power set

public class Q6 {
        static void inner_Print(int arr[] , int size ){
            for (int item: arr) {
                System.out.print(item+" ");
            }

        }
        static void printPowerSet(char [] char_set, int set_size) {

        /*set_size of power set of a set
        with set_size n is (2**n -1)*/
            long pow_set_size = (long)Math.pow(2, set_size);
            int counter, j;

        /* Run from counter 000..0 to 111..1 */
            for(counter = 0; counter < pow_set_size; counter++) {
                for(j = 0; j < set_size; j++) {
                /* Check if jth bit in the
                counter is set If set then
                print jth element from set */
                    if((counter & (1 << j)) > 0) {
                        System.out.print(char_set[j]);
                   }
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        // Driver program to test printPowerSet
        public static void main (String[] args) {
            char []char_set = {'a', 'b', 'c'};
            printPowerSet(char_set, 3);
            int[] ar1 = new int[5];
            for (int i:ar1) {
                ar1[i] = i+1;
            }
            inner_Print( ar1 , ar1.length);
        }
    }