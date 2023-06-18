
class QueueArray {

    public int front;
    private int rear;
    private int capacity;
    public int count;
    int[] arr;

    QueueArray() {
        front = rear = -1;
        capacity = 4;
        count = 0;
        arr = new int[capacity];

    }

    public void enqueue(int data) {
        if (rear == capacity - 1) {
            capacity = capacity *= 2;
            int[] temp = new int[capacity];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        rear++;
        arr[rear] = data;
        count++;

    }

    public void dequeue() {
        if (rear == -1) {
            System.out.println("Empty Queue");
            return;
        }
        if (front == rear) {
            front = rear = -1;
        } else {

            for (int i = 1; i <= rear; i++) {
                arr[i - 1] = arr[i];
            }
            rear--;
        }
        count--;
    }

    public boolean contain(int data) {
        if (front == -1) {
            System.out.println("Queue is empty");
        }

        for (int i = 0; i <= rear; i++) {
            if (arr[i] == data) {
                return true;
            }
        }

        return false;
    }

    public void print() {

        System.out.print("items : ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " <-");
        }

    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        QueueArray l = new QueueArray();

    }
}
