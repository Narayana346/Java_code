package DSA.Data_structure.listDataStructure.MyStack;
import DSA.Data_structure.listDataStructure.MyLinkedList.customLinkedList;
public class customStack <E>{                                 //generic type class

    private customLinkedList<E> ll = new customLinkedList<>();

    void push(E e){
        ll.add(e);
    }

    E Pop() throws Exception {
        if (ll.isEmpty()){
            throw new Exception("Popping form empty Stack is not allowed");
        }
        return ll.removeLast();
    }            //generic method

    E peek()throws Exception{
        if (ll.isEmpty()){
            throw new Exception("peeking from empty stack is not allowed");
        }
        return ll.getLast();

    }   //generic method

}
