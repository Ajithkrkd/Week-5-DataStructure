import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        StackQueue l = new StackQueue();
        l.enQueue(6);
        l.enQueue(3);
        l.enQueue(4);
        l.enQueue(5);
        l.enQueue(90);
      
         
         System.out.println(l.peek());
         l.print();

    }

}
class StackQueue{
    private Stack <Integer> first;
    private Stack <Integer> second;

    StackQueue(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void enQueue(int data) {
        first.push(data);
    }
    public int dequeue() {
        if(first.isEmpty()){
            System.out.println("queue is empty");
        }
        while(!first.isEmpty()){
             second.push(first.pop());
        }
        int removed = second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public boolean isEmpty() {
        if(first.isEmpty()){
            return true;
        }
        return false; 
    }
    public int peek() {
         while(!first.isEmpty()){
             second.push(first.pop());
        }
         int peeked = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
    public void print(){
        System.out.println(first);
    }
}
