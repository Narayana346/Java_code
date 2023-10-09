package pratice_section.Accenture;

import java.io.IOException;
import java.util.*;

public class Test {
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args) throws IOException {
        int[] backLink = {111,10,1,50,50};
        String[] webPage = {"abcde","netgy","swissbook","test","gear"};
        int size = webPage.length;

        Map<String, Integer> stored = new HashMap<>();

        for (int i = 0; i < size; i++) {
            stored.put( webPage[i] ,backLink[i]);
        }

        Arrays.sort(backLink);

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(getKey(stored, backLink[i]));
            stored.remove(getKey(stored, backLink[i]));
        }
    }
}
