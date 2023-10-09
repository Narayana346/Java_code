package pratice_section.String_QUS;


import java.util.*;

/*
number to roman .
and
roman to number .
*/
public class q1 {
    public static void main(String[] args) {
        System.out.println("Enter the number to convert roman num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder res = num_to_roman(num);
        System.out.println(res);
        System.out.println("Enter the roman_num ");
        String roman = sc.next();
        int num2 = roman_to_num(roman);
        System.out.println(num2);

    }

    public static StringBuilder num_to_roman(int num) {
        StringBuilder res = new StringBuilder();
        String[] roman_sign = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] roman_value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int pos = 0; num > 0; pos++) {
            int count = 0;
            while (num >= roman_value[pos]) {
                count = num / roman_value[pos];
                num %= roman_value[pos];
            }
            while (count > 0) {
                res.append(roman_sign[pos]);
                count--;
            }

        }
        return res;
    }

    public static int roman_to_num(String str) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = str.length();
        int res = map.get(str.charAt(len-1));
        for (int i = str.length()-2; i>=0;i--){
            if (map.get(str.charAt(i)) < map.get(str.charAt(i+1))){
                res = res - map.get(str.charAt(i));
            }else {
                res = res + map.get(str.charAt(i));
            }
        }
        return (res);

    }

}