package DSA.Data_structure.Tree_Data_Structure.Binary_Tree;

import DSA.Data_structure.Tree_Data_Structure.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static class TreeInfo{
        int height;
        int diameter;
        TreeInfo(int height,int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
    // Helper class to hold the current index
    static class Index {
        int value = 0;
    }

    public Node buildBinaryTree(int[] nodes) {
        Index index = new Index();
        return buildTreeHelper(nodes, index);
    }

    private Node buildTreeHelper(int[] nodes, Index index) {
        if (index.value >= nodes.length || nodes[index.value] == -1) {
            index.value++;
            return null;
        }

        Node newNode = new Node(nodes[index.value++]);
        newNode.left = buildTreeHelper(nodes, index);
        newNode.right = buildTreeHelper(nodes, index);
        return newNode;
    }

    public static void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currentNode = q.remove();
            if (currentNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                System.out.print(currentNode.data+" ");
                if (currentNode.left != null){
                    q.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q.add(currentNode.right);
                }
            }
        }
    }

    public static int countOfNode(Node root){
        if (root == null){
            return 0;
        }
        int leftNodeCount = countOfNode(root.left);
        int rightNodeCount = countOfNode(root.right);

        return leftNodeCount + rightNodeCount + 1;
    }
    public static int sumOfNode(Node root){
        if (root == null){
            return 0;
        }
        int leftNodeSum= sumOfNode(root.left);
        int rightNodeSum = sumOfNode(root.right);

        return leftNodeSum + rightNodeSum + root.data;
    }

    public static int heightOfTree(Node root){
        if (root == null){
            return 0;
        }
        int leftNodeHeight= heightOfTree(root.left);
        int rightNodeHeight = heightOfTree(root.right);

        int myHeight = Math.max(leftNodeHeight,rightNodeHeight) + 1;

        return myHeight;
    }

    private static int diameterOfTree(Node root){
//        On2 approach

        if (root == null){
            return 0;
        }
        int diameterOfLeftNode = diameterOfTree(root.left);
        int diameterOfRightNode = diameterOfTree(root.right);

        int diameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diameter,Math.max(diameterOfLeftNode,diameterOfRightNode));
    }
    private static TreeInfo diameterOfTree2(Node root){
//        On approach
        if (root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameterOfTree2(root.left);
        TreeInfo right = diameterOfTree2(root.right);

        int myHeight = Math.max(left.height,right.height)+1;
        int leftDimeter = left.diameter;
        int rightDimeter = right.diameter;
        int myDimeter = left.height + right.height + 1;

        int maxDiameter = Math.max(Math.max(leftDimeter,rightDimeter),myDimeter);
        return new TreeInfo(myHeight,maxDiameter);
    }

    private static boolean isSubtree(Node root , Node subTree){
        if (subTree == null){
            return true;
        }
        if (root == null){
            return false;
        }
        if (root.data == subTree.data){
            if (isIdentical(root,subTree)){
                return true;
            }
        }
        return (isSubtree(root.left,subTree) || isSubtree(root.right,subTree));
    }
    private static boolean isIdentical(Node root , Node subTree){
        if (root == null && subTree == null){
            return true;
        }
        if (root == null || subTree == null){
            return false;
        }
        if (root.data == subTree.data) {
            return isIdentical(root.left, subTree.left) && isIdentical(root.right, subTree.right);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] nodes2 = {1,2,-1,-1,3,-1,-1};
        BinaryTree tree = new BinaryTree();
        BinaryTree subTree = new BinaryTree();
        Node root = tree.buildBinaryTree(nodes);
        Node subTreeRoot = subTree.buildBinaryTree(nodes2);
//        preOrder(root);
//        System.out.println();
//        inOrder(root);
//        System.out.println();
//        postOrder(root);
        levelOrder(root);
        levelOrder(subTreeRoot);
//        System.out.println(sumOfNode(root));
//        System.out.println(heightOfTree(root));
//        System.out.println(diameterOfTree(root));
//        System.out.println(diameterOfTree2(root).diameter);
        System.out.println(isSubtree(root, subTreeRoot));
    }
}
