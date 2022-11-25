import java.util.Map;

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
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.front.data);
        System.out.println("Queue Rear : " + q.rear.data);

        MyMap<Integer, String> map = new MyMap<>();
        map.put(1, "Hoa");
        map.put(2, "Lan");
        map.put(3, "Lan");
        System.out.println(map.size());
        System.out.println(map.get(2));
        map.remove(3);
        System.out.println(map.size());

    }
}