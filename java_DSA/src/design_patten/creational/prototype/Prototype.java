package design_patten.creational.prototype;

public class Prototype implements Cloneable {
    private String name;
    
    public Prototype(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Prototype){
            Prototype other = (Prototype) obj;
            return this.name.equals(other.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Prototype [name=" + name +"]";
    }
}
