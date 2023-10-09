package pratice_section.class_pratice;

import java.util.*;
import java.util.stream.Collectors;

public class c1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        int count = 0;
        arr.add("mike");
        arr.add("Arjun");
        arr.add("mike");
        arr.add("nisha");
        arr.add("karshika");
        arr.add("sarshika");
        arr.add("mam");
        arr.add("stamina");
    String str="mike";
       System.out.println(arr);

        for (int i = 0;i< arr.size();i++){
            if (arr.get(i).equals(str)){
                count++;
            }

        }
        System.out.println(count);
        Collections.sort(arr);
        System.out.println(arr);

        TreeSet<String> tr1 = new TreeSet<>();
        for (int i = 0;i< arr.size();i++){
                tr1.add(arr.get(i));
            }


        System.out.println(tr1);
        System.out.println(Collections.min(tr1));
        System.out.println(Collections.max(tr1));

        for (int i = 0;i< arr.size();i++){
            if (arr.get(i).startsWith("s")){
                System.out.println(arr.get(i));
            }
        }
        for (int i = 0;i< arr.size();i++){
            if (arr.get(i).endsWith("m")){
                System.out.println(arr.get(i));
            }
        }
        int count2 = 0;
        int i = 0;
        for ( i = 0;i< arr.size();i++){
            if (arr.get(i).charAt(i) == 'a'){

            }
        }
        System.out.println(arr.get(i));










        }


    }


