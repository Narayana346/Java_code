package pratice_section.pattern_question;

public class q10 {
    public static void main(String[] args) {
        int row = 7;
        boolean check;
        for(int i = 1;i<=row;i++){
            check = true;
            for (int j = 1 ;j<=i;j++){
                if (check){
                    System.out.print(1+" ");
                    check=false;
                }else{
                    System.out.print(0+" ");
                    check=true;
                }
            }
            System.out.println();
        }
    }
}
