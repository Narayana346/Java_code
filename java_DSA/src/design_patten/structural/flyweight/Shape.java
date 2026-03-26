package design_patten.structural.flyweight;

public class Shape {
    String color;

    Shape(String color){
        this.color = color;
    }

    public void draw(){
        System.out.println("Drawing " + color);
    }
}

