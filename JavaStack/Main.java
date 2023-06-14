package JavaStack;

//here iam going to a linked list
class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedListStack {
    public Node top;
    public int count;

    LinkedListStack() {
        top = null;
        count = 0;
    }

    // "push" for adding a element int the stack "top"
    public void push(int data) {
        Node node = new Node(data);

        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
        count++;

    }

    // function for printing elements in linked list
    public void print() {
        if (count == 0) {

            try {
                throw new Exception("empty Linked List");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // pop funtion for deleting the top element
    public int pop() {
        // if top is null there is no element so throw an error
        // if it is not null point the "top to top.next" creating a another reference to
        // top it is called "temp"
        // then the temp is pointing to last element then i want to point the temp.next
        // = null;
        if (top == null) {
            try {
                throw new Exception("empty Linked List");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int pop = top.data;
        Node temp = top;
        top = top.next;
        temp.next = null;
        count--;

        return pop;
    }

    public void peek() {
        if (top == null) {
            try {
                throw new Exception("empty Linked List");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("The peek element is : " + top.data);
        }
    }

    // this function is use to check a value is there in the linked list stack ia it
    // there it will return "true"
    // otherwise it return false
    public boolean contain(int data) {
        if (top == null) {
            try {
                throw new Exception("empty Linked List");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Node temp = top;
            while (temp != null) {
                if (temp.data == data) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    // this clear function is used to clear the all elements in the stack
    public void clear() {
        if (top == null) {
            try {
                throw new Exception("this stack is already is empty");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        while (top != null) {
            pop();
        }

    }
}

public class Main {
    public static void main(String[] args) {
        LinkedListStack l = new LinkedListStack();
        // pop
        // push
        // contain
        // print
        // clear
        // peek
    }
}
