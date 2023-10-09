package pratice_section.pattern_question;

public class q12 {
    public static void main(String[] args) {
        int row = 5,count=0;
        for (int i = 1;i<=row;i++){
            count=i;
            for (int j = 1;j<=i;j++){
                System.out.print(count+"  ");
                count = count+(row-j);
            }
            System.out.println();
        }
    }
}
