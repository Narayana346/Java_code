package DSA.Algorithm.Greedy;

// In this approach name is --> Activity Selection Problem .
// the time complexity is reduce the 1 degree .
public class A1 {
    public static void main(String[] args) {
        int[] start = {48,43,61,54,99,84,3,3,59,30,45,72,24,87,21,48,54,88,8,67,41,64,87,54,5,62,87,33,74,92};
        int[] end = {150,67,137,131,139,115,49,6,117,126,59,109,27,96,73,60,99,108,50,145,68,104,102,82,7,126,118,93,148,150};
        for(int i = 0; i< end.length ; i++){
            for (int j = i+1; j < end.length ;j++){
                if(end[i]>end[j]){
                    int temp = end[i];
                    end[i] = end[j];
                    end[j] = temp;
                }
            }
        }
        for (int item:end
             ) {
            System.out.print(item +" ");
        }
    }
}
