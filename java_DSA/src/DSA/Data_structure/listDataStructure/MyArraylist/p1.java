package DSA.Data_structure.listDataStructure.MyArraylist;
import java.util.ArrayList;
import java.util.Iterator;

class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("apple");
        System.out.println(fruits);
        ArrayList<String> marks = new ArrayList<>();
        pair<String,Integer> p1 = new pair("narayana",20);
        p1.getDescription();
        System.out.println(marks);
        p1.getDescription();
        System.out.println("my name ids narayana maharana in the class room in the year");
    }

    public static class example {
        public static void main(String[] args) {
            ArrayList l1 = new ArrayList(4);
            l1.add("puja");
            l1.add("narayana");
            l1.add("suse");
            l1.add(0,"bhagabana");
            l1.add("miss pochik");
            Iterator it = l1.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
class pair<X,Y>{
    X X;
    Y Y;
    public pair(X X, Y Y){
        this.X = X;
        this.Y = Y;
    }
    public void getDescription(){
        System.out.println(X +" "+Y);
    }

}