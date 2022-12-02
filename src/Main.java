import java.lang.reflect.Array;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("The top element is " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The stack is not empty");
        }

        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("Queue Front : " + q.front);
        System.out.println("Queue Rear : " + q.rear);

        MyMap<Integer, String> map = new MyMap<Integer, String>();
        System.out.println("Going to add entries in map");
        map.put(null, "Nothing");
        map.put(1, "ETC");
        map.put(2, "John");
        map.get(1);
//        System.out.println("Displaying all the entry in map");
        map.display();
//        System.out.println("Removing the entry with key 2");
//        map.remove(2);
//        map.display();
//        System.out.println("Adding duplicate key 1 in map");
//        map.put(1, "CSE");
//        map.put(2, "John again");
//        System.out.println("Displaying all the entry in map again");
//        map.display();
//        System.out.println("Adding entry with key 17 in map");
//        map.put(17, "CS");
//        map.display();

    }



}