



//Basically  A queue is linear data structure using
//it is worked in principle of FIFO (first in first out)
//Queue  is used to hold data's it is limiting the insertion at the end only
// and the insertion at front only 
class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        next = null;

    }

}

class Queue {
    private Node head;
    private Node tail;
    public int count;

    Queue() {
        head = tail = null;
        count = 0;
    }

    // methode for Adding element in the front "head"
    public void enqueue(int data) {
        Node node = new Node(data);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;
    }

    public void print() {
        Node temp = head;
        if (count == 0) {
            System.out.println("Empty Queue");
            return;
        }

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    // we can only perform deletion in front side
    public void dequeue() {
        if (head == null) {
            System.out.println("empty Queue");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        count--;
    }

    // this clear function is used to clear all elements
    public void clear() {
        if (head == null) {
            System.out.println("This Queue is already empty");
            return;
        }
        Node temp = head;

        while (head != null) {
            dequeue();
        }

        System.out.println("cleared");

    }

    public boolean contain(int data) {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty Queue");
        }
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // the peek element of A Queue is return the "head" of a queue list
    public void peek() {
        if (head == null) {
            System.out.println("Queue is Empty");
            return;
        } else {
            System.out.println(head.data);
        }

    }

}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue l = new Queue();

    }
}
