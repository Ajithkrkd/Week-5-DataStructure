
class QueueArray {
    private int data;
    public int head;
    private int tail;
    private int capacity;
    public int count;
    int[] arr;

    QueueArray() {
        head = tail = -1;
        capacity = 4;
        count = 0;
        arr = new int[capacity];

    }

    public void enqueue(int data) {
        if (tail == capacity - 1) {
            capacity = capacity *= 2;
            int[] temp = new int[capacity];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        tail++;
        arr[tail] = data;
        count++;

    }

    public void dequeue() {
        if (tail == -1) {
            System.out.println("Empty Queue");
            return;
        }
        if (head == tail) {
            head = tail = -1;
        } else {

            for (int i = 1; i <= tail; i++) {
                arr[i - 1] = arr[i];
            }
            tail--;
        }
        count--;
    }
    public boolean contain(int data) {
        if(head == -1){
            System.out.println("Queue is empty");
        }
        
            for (int i = 0; i <= tail; i++) {
               if( arr[i] == data){
                return true;
               }
            }  
        
        return false;
    }

    public void print() {
        for (int i = tail; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        QueueArray l = new QueueArray();
        l.enqueue(1);
        l.enqueue(2);
        l.enqueue(3);
        l.enqueue(4);
        l.enqueue(5);
        // l.dequeue(); 
        System.out.println(l.contain(1));
        l.print();
    }
}
