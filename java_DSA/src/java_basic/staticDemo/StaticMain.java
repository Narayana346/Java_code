package java_basic.staticDemo;
import OPPS_IN_JAVA.tyone;
public class StaticMain extends mice implements tyone ,li {
    static int a = 10;
    public StaticMain(){
        System.out.println("iam constructor");
    }

    @Override
    public void StringManupulate() {
        System.out.println("my name is narayana maharana");
    }
    @Override
    public void displayed(){System.out.println("interface li in java");}
    @Override
    public void show() {
        System.out.println("li interface 2nd method");
    }

    static void display(){
        System.out.println("static method");
    }
   static{System.out.println("STATIC BLOCK");}
    {System.out.println("i am non-static block");}

    public static void main(String[] args) {
       StaticMain s1 = new StaticMain();
        System.out.println("main method");
        System.out.println("static variable "+a);
       StaticMain.display();
       s1.StringManupulate();
       System.out.println(s1.age);
        System.out.println(s1.nikal);
        System.out.println(StaticMain.age);
    }
}
interface li{
    int age = 45;
    void displayed();
    void show();
}
class mice{
    static int nikal;
    static {
        nikal = 82;


    }
}

