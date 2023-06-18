import java.util.Stack;

class RemoQueueStack{
    Stack <Integer> first;
    Stack <Integer> second;

    RemoQueueStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void enQueue(int data)  {
        if(first.isEmpty()){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(data); 
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int  deQueue()    {
        if(first.isEmpty()){
             try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int remove = first.pop();
        return remove;
    }

    public int peek() {
         return first.peek();
    }
    public void print() {
    System.out.println(first);
    }
    public boolean isEmpty() {
       return first.isEmpty() && second.isEmpty(); 
    }
}

public class removeEffientQueueUsingstack {
    public static void main(String[] args) {
        RemoQueueStack rq =new RemoQueueStack();
      
    }
}
