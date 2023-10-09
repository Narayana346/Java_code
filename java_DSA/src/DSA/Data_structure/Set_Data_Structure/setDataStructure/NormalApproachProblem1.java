package DSA.Data_structure.Set_Data_Structure.setDataStructure;
//sub array sum of zero
//normal approach
public class NormalApproachProblem1 {
    public static void main(String[] args) {
        int []array = {2,1,3,4,-2};
        boolean found = false;
        for (int i = 0;i<array.length;i++){
            int sum = 0;
            for (int j = 0;j< array.length;j++){
                sum = sum + array[j];
                if (sum == 0){
                    found = true;
                    break;
                }
            }

            if (found) break;
        }
        System.out.println("found - "+ found);
    }
}
