package design_patten.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> map = new HashMap<>();

    public static Shape getShape(String color){
        if(!map.containsKey(color)){
            map.put(color,new Shape(color));
        }
        return map.get(color);
    }
}