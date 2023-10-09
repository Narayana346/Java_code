package pratice_section.Accenture;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long num = sc.nextLong();
        System.out.println(inToWords(num));

    }
    public static String inToWords(long num){
        final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String result = "";
        if (num == 0){
            return "zero";
        }
        if (num >= 1000000000) {
            result += inToWords(num / 1000000000) + " billion ";
            num %= 1000000000;
        }

        if (num >= 1000000) {
            result += inToWords(num / 1000000) + " million ";
            num %= 1000000;
        }

        if (num >= 1000) {
            result += inToWords(num / 1000) + " thousand ";
            num %= 1000;
        }

        if (num >= 100) {
            result += " and "+ones[(int)(num / 100)] + " hundred ";
            num %= 100;
        }
        if (num > 0) {
            if (num >= 20) {
                result += tens[(int)num / 10]+" " ;
                num %= 10;
            } else if (num >= 11) {
                result += teens[(int)num - 10] + " ";
                num = 0;
            }

            if (num > 0) {
                result += ones[(int)num] + " ";
            }
        }

        return result.trim();

    }
}
