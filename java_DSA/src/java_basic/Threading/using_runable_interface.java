package Threading;
class a implements Runnable{
    @Override
    public void run() {
        int i ;
        for (i =0;i<=10;i++){
            System.out.println("thread A "+i);
        }
    }
}
class b implements Runnable{
    @Override
    public void run() {
        int i ;
        for (i =0;i<=10;i++){
            System.out.println("thread B "+i);
        }
    }
}
 public class using_runable_interface {
     public static void main(String[] args) {
         Thread t1 = new Thread(new a());
         Thread t2 = new Thread(new b());
         t1.start();
         t2.start();

     }

    }




