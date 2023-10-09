package pratice_section.String_QUS;

public class q3 {
    public static void main(String[] args) {
        String[] str = {"five","four","nine","eight","double","two","triple","nine"};
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length;i++){
            if(str[i].equals("double")){
                for(int j=0;j< 2;j++){
                    res.append(occurrence(str[i+1]));
                }
                i++;
            }else if(str[i].equals("triple")){
                for(int j=0;j< 3;j++){
                    res.append(occurrence(str[i+1]));
                }
                i++;
            }else res.append(occurrence(str[i]));
        }
        System.out.println(res);
    }
    public static String occurrence(String check){
        switch(check){
            case "one":
                return "1";
            case "two":
                return "2";
            case "three":
                return "3";
            case "four":
                return "4";
            case "five":
                return "5";
            case "six":
                return "6";
            case "seven":
                return "7";
            case "eight":
                return "8";
            case "nine":
                return "9";
            default: return "0";
        }
    }
}
