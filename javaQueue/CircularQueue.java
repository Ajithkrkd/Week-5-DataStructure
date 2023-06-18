//circular Queue or RING-BUFFER it is linear data structure insertion and deletion are only work in 
//oposite ends  follow the principle FIFO


class CQueue {
    public int front;
    public int rear;
    public int size;
    int[] arr;

    // initializing using constructor
    CQueue(int size) {
        front = -1;
        rear = -1;
        this.size = size;
        this.arr = new int[size];
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }  
        if (front == (rear + 1)) {
            return true;
        }
        return false;
    }

    // if our Queue is full then we want sent a message the Queue is full
    // if there is no element we want move the front from -1 to 0
    // also add item to arr[rear]
    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("the Queue is full");
        } else if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
        System.out.println("Inserted : " + data );
    }

    // while we perform the deQueue check the following condition
    // if there is no element
    // if there is one element
    // also some elements are there then the front move ahead
    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Can't deQueue becuase there is No element");
            return -1;
        }
        element = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return element;
    }
    public void print() {
        int i;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            for( i = front; ; i = (i + 1) % size){
                System.out.print(arr[i] + " ");
                if(i == rear){
                    break;
                }
            }
        }
    }
}

public class CircularQueue {
    public static void main(String[] args) {
       
    }
}