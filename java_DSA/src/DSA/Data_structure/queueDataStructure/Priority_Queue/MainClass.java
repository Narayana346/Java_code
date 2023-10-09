package queueDataStructure.Priority_Queue;

import java.util.PriorityQueue;

public class MainClass {
    public static void main(String[] args) {
        PriorityQueue<String> fruit = new PriorityQueue <>();
        PriorityQueue<Integer> num = new PriorityQueue <>();
        fruit.add("Apple");
        fruit.add("mango");
        fruit.add("Banana");
        fruit.add("papilla");
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println(num);
        System.out.println(num.peek());
        System.out.println(fruit);
        System.out.println(fruit.peek());
        System.out.println(fruit.remove());
        System.out.println(fruit.remove());
        System.out.println(fruit.remove());
        System.out.println(fruit.remove());
        System.out.println(fruit.remove());
    }

}
