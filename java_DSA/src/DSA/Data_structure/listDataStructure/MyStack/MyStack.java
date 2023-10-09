package DSA.Data_structure.listDataStructure.MyStack;


public class MyStack {
    public static void main(String[] args) throws Exception {
        stackUsingArray stack = new stackUsingArray(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.push(5);
        stack.printStack();




    }
}

