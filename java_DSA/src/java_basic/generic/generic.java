package java_basic.generic;

public class generic {
    public static void main(String[] args) {
        Mydata <String> m1 = new Mydata<String>();
        Mydata <Integer> m2 = new Mydata<Integer>();
        Integer k = new Integer(5);
        m2.add(k);
        m1.add("rahul");
        System.out.println(m1.get() +" age is  "+m2.get());

    }
}
class Mydata<T>{
    T i;
    public void add(T i1){ i = i1;}
    public T get(){
        return(i);
    }


}
