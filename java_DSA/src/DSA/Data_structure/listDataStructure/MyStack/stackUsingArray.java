package DSA.Data_structure.listDataStructure.MyStack;

public class stackUsingArray {
    int size;
    int[] array;
    int top;
    public stackUsingArray(int size){
        this.size = size;
        array = new int[size];
        top = -1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == size-1;
    }
    boolean push(int data){
        if(isFull()){
            System.out.println("stack is overflow");
            return false;
        }
        array[++top] = data;
        return true;
    }
    boolean pop(){
        if(isEmpty()){
            System.out.println("stack is underflow");
            return false;
        }
        top--;
        return true;
    }
    int peek(){
        return array[top];
    }
    void printStack(){
        for(int index = 0; index <= top;index++){
            System.out.print(array[index]+" ");
        }
        System.out.println();
    }
}
