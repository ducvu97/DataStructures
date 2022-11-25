public class Queue {
 Node front;
 Node rear;

 public Queue(){
     this.front = null;
     this.rear = null;
 }

 public void enqueue( int key){
     Node temp = new Node(key);
     if (this.rear == null){
         this.front = this.rear = temp;
         return;
     }
     this.rear.next = temp;
     this.rear = temp;
 }

 public void dequeue(){
     if (this.front == null)
         return;

     Node temp = this.front;
     this.front = this.front.next;

     if (this.front == null)
         this.rear = null;
 }
}
