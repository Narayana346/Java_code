package pratice_section.Array_QUS;
// rectangle overlapping .
public class Q11 {
    public static void main(String[] args) {
        int[] rec1 = {1, 4, 2, 8};
        int[] rec2 = {1, 3, 2, 4};
        System.out.println(isRectangleOverlap(rec1,rec2));
    }
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2)
    {
        //You can code here

        if(rec1[2] <= rec2[0] || rec1[0] >= rec2[2])
            return false;

        if(rec1[1] >= rec2[3] || rec1[3] <= rec2[1])
            return false;

        return true;
    }
}
