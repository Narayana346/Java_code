package DSA.Data_structure.listDataStructure.MyLinkedList;


public class customLinkedList<E> {
    public static class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    Node<E> head;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(E data) {
        Node<E> toAdd = new Node<>(data);
        if (isEmpty()) {
            head = toAdd;
            return;
        }
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    public Node<E> insertInLinkedList(int pos, E data, Node<E> head) {
        Node<E> newNode = new Node<>(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        Node<E> temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public Node<E> deleteInLinkedList(int pos, Node<E> head) {
        if (pos == 0) {
            head = head.next;
            return head;
        }
        Node<E> temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }


    public void print() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }


    public E removeLast() throws Exception {
        Node<E> temp = head;
        if (temp == null) {
            throw new Exception("cannot remove last element from empty LinkedList");
        }
        if (temp.next == null) {
            Node<E> toRemove = head;
            head = null;
            return toRemove.data;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node<E> toRemove = temp.next;
        temp.next = null;
        return toRemove.data;
    }


    public E getLast() throws Exception {
        Node<E> temp = head;
        if (temp == null) {
            throw new Exception("cannot peek last element from empty LinkedList");
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

}