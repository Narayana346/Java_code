package DSA.Data_structure.queueDataStructure.MyQueue;

//import DSA.Data_structure.queueDataStructure.*;

import DSA.Data_structure.listDataStructure.MyLinkedList.customLinkedList.Node;

public class customQueue< E > {
    private Node < E > head, rear;
    public void enqueue(E e){                               //push() --->  r --> enqueue()
        Node<E> toAdd = new Node <>(e);
        if (head == null){
            head = rear = toAdd;
            return;
        }
        rear.next= toAdd;
        rear = rear.next;
    }
    public E dequeue(){                         //pop() ---> h --> dequeue()
        if (head == null){
            return null;
        }
        Node<E> temp = head;
        head = head.next;
        if (head == null){
            rear =null;
        }
        return temp.data;
    }
}
