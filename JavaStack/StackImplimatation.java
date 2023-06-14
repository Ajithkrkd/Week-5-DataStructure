package JavaStack;

// I created a stack class for stack implimantation a stack ,

//  Stack is basically a Class from the collection frame Work
//stack is one of the Data structure and it is linear Data structure 
//stack have only one pointer it is called "top" Only insertion and delettion is posible in top

public class StackImplimatation<T> {
    /**
     * use "count" for print size
     * i want a "top" pointer in stack.
     * "count" for find the size of total element count
     * capacity is the stack capacity if the capacity is exeeded when we adding
     * element then the capacity is doubled
     * We can use array and Linked lsit for stack implimantaion
     * In array we point the "top" to the last index of array and while we push an
     * element then upadate the top-> "top++"
     * While we pop then we decrement the top -> "top--"
     * while using Linked the "top" of the stack is represented to the head of the
     * node the we can performe deletion and insertion
     */

    private int top;
    private int count;
    private int capacity;
    private T[] arr;

    StackImplimatation() {
        top = -1;
        capacity = 4;
        count = 0;
        arr = (T[]) new Object[capacity];
    }

    // push a element into stack
    public void push(T data) {
        // when the stack is full then we want create a another array and it is the
        // capacity is doubled
        // then then the new array "temp" is pointing to prevous array "arr"
        if (top == capacity - 1) {
            capacity = capacity *= 2;
            T[] temp = (T[]) new Object[capacity];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        top++;
        arr[top] = data;
        count++;
    }

    public void pop() {
        // this function for removing the element from the sack that is top will
        // decremented "top--"
        if (top == -1) {
            try {
                throw new Exception("Stack is Empty", null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            top--;
            count--;
        }
    }

    public void peek() {
        // this function is to find the peek element in the stack so we just simply
        // return the top
        if (top == -1) {
            try {
                throw new Exception("Stack is Empty", null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Peek element is : " + arr[top]);
        }
    }

    // here Iam creating a function to find a perticular element is contain in this
    // stack
    public boolean contain(T data) {
        for (int i = top; i > 0; i--) {
            if (arr[i] == data) {
                return true;
            }
        }
        return false;
    }

    // this "Clear" function is clear all the elements in stack
    public void clear() {
        if (top == -1) {
            try {
                throw new Exception("Stack already is Empty", null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            top = -1;
            System.out.println("cleared");
        }
    }

    // This function for Printing elements in stack i Want print first "top" so
    // starting the loop from "top"
    // and it goes to index 0 then print arr[i];
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        StackImplimatation<Integer> l = new StackImplimatation();
        // here i use Integer Wrapper class for perform action in Integers
        // you Can Use String for perform Action in String

    }

}