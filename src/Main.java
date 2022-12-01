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

    }



}