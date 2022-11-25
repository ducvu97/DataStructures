import java.util.Map;

public class Stack {
    private Node top;
    private int nodesCount;

    Stack(){
        this.top = null;
        this.nodesCount = 0;
    }

    public void push(int x){
        Node temp = new Node();
        if (temp == null){
            System.out.println("Heap Overflow");
            return;
        }
        System.out.println("Inserting " + x);
        temp.data= x;
        temp.next = top;
        top = temp;
        this.nodesCount +=1;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
        }
        return top.data;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
        }
        int top = peek();
        System.out.println("Removing "+ top);
        this.nodesCount -= 1;
        this.top =(this.top).next;

        return top;
    }


    public int size(){
        return this.nodesCount;
    }
}
