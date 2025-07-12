package DSA.Data_structure.Tree_Data_Structure.BST;

import DSA.Data_structure.Tree_Data_Structure.Node;

import java.util.ArrayList;

public class BinarySearchTree {

    private static Node insert(Node root , int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if (root.data > value){
            // left Subtree
            root.left = insert(root.left,value);
        }else {
            root.right = insert(root.right,value);
        }
        return root;
    }
    public static void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
    public static boolean isPresent(Node root , int value){
        if (root == null){
            return false;
        }
        if(root.data > value){
            return isPresent(root.left,value);
        } else if (root.data == value) {
            return true;
        }else {
            return isPresent(root.right,value);
        }
    }
    public static Node delete(Node root , int value){
        if (root.data > value){
            root.left = delete(root.left,value);
        } else if (root.data < value) {
            root.right = delete(root.right,value);
        }else {
            // case 1
            if (root.left == null && root.right == null){
                return null;
            }
            // case 2
            if (root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 (inOrderSuccessor is right subtree left most node .)
            Node inOderSuccessor = inOrderSuccessor(root.right);
            root.data = inOderSuccessor.data;

            delete(root.right,inOderSuccessor.data);

        }
        return  root;
    }

    public static Node inOrderSuccessor(Node root){

        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root , int x , int y){
        if (root == null){
            return;
        }
        if (root.data >= x && root.data <= y){
            printInRange(root.left,x,y);
            System.out.print(root.data +" ");
            printInRange(root.right,x,y);
        }else if (root.data >= y){
            printInRange(root.left,x,y);
        } else {
            printInRange(root.right,x,y);
        }
    }

    public static void printRootToLeaf(Node root , ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null){
            printPath(path);
        }else {
            printRootToLeaf(root.left,path);
            printRootToLeaf(root.right,path);
        }
        path.removeLast();
    }

    private static void printPath(ArrayList<Integer> path) {
        for(int value : path){
            System.out.print(value +" -> ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;

        for(int value : values){
            root = insert(root,value);
        }
//        inOrder(root);
//        System.out.println();
//        System.out.println(isPresent(root,2));
//        delete(root,4);
//        inOrder(root);
//        printInRange(root,5,7);

        printRootToLeaf(root,new ArrayList<>());

    }
}
