package DSA.Data_structure.listDataStructure.MyLinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        customLinkedList cl = new customLinkedList();
        for (int i =0;i<=10;i++){
            cl.add(i);
        }
        cl.print();
        System.out.println();
        cl.insertInLinkedList(2 , 8 , cl.head);
        cl.print();
        System.out.println();
        cl.deleteInLinkedList(4, cl.head);
        cl.print();
    }
}






