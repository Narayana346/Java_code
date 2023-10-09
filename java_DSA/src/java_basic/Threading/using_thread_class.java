package Threading;
class  A extends Thread{
    @Override
    public void run() {
        int i;
        for (i=0;i<=10;i++){
            System.out.println("class A "+i);
        }
    }
}
class  B extends Thread{
    @Override
    public void run() {
        int i;
        for (i=0;i<=10;i++){
            System.out.println("class B "+i);
        }
    }
}
public class using_thread_class {
    public static void main(String[] args) {
        A o1 = new A();
        B o2 = new B();
        o1.start();
        o2.start();
    }
}
