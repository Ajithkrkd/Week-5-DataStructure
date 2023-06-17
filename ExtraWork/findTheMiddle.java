


class Node{
    public int val ;
    public Node next;
    public Node prev;


   public Node (int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class LinkedListMiddle{
    public Node head;
    public Node prev;
    
    LinkedListMiddle(){
      head = prev = null;
    }

    public void addLast(int val) {
        Node node = new Node(val);

        if(head == null){
            head = node;
        }
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
    }

    public void print() {
        if(head == null){
            System.out.println("empty List");
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
    }
    public int middle(Node head) {
        if(head == null){
            System.out.println("Empty List");
            
        }
         Node slow = head;
         Node fast = head; 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
 public void deleteMid() {
     if(head == null){
            System.out.println("Empty List");
            
        }
         Node slow = head;
         Node fast = head;
         
        while(fast != null && fast.next != null){
           fast = fast.next.next;
           prev = slow;
           slow = slow.next;
           
        }
        prev.next = slow.next;
    }
}
public class findTheMiddle {
    public static void main(String[] args) {
        LinkedListMiddle list = new LinkedListMiddle();
        list.addLast(5);
        list.addLast(4);
        list.addLast(3);
        list.addLast(23);
        list.addLast(2);
        list.addLast(1);
        list.addLast(1);

        list.print();
        System.out.println(".............................................");
        
        list.deleteMid();
        list.print();
    }
}