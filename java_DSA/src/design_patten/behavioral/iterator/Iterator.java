package design_patten.behavioral.iterator;

import design_patten.behavioral.command.Light;

import java.util.List;

public class Iterator {
    public static void iterate() {
        List<String> list = List.of("Light", "Fan", "TV");
        java.util.Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
