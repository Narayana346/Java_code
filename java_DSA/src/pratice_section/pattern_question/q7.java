package pratice_section.pattern_question;

public class q7 {
    public static void main(String[] args) {
        int row = 7;
        int k=0;
        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
                k=j;
            }
            for (int j = k-1;j>0;j--){
                System.out.print(j+" ");
                k=j;
            }
            System.out.println();

        }

    }
}
