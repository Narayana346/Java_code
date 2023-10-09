package java_basic.RegularExpression;

import java.util.Scanner;
import java.util.regex.*;

public class p1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            while (true){
                System.out.println("Enter the regex pattern");
                String regexPattern = sc.nextLine();
                Pattern pattern = Pattern.compile(regexPattern);
                Matcher matcher = pattern.matcher("welcome to Edureka youTube channel");
                boolean found = false;
                while (matcher.find()){
                    System.out.println("found the text"+matcher.group()+" Starting index "+matcher.start()+" and ending index "+matcher.end());
                    found = true;
                }
                if (!found){
                    System.out.println("match not found");
                }
            }
        }
    }
}
