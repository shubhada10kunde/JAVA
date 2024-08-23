// Floyd's algorithm of detecting loops
package DSA;
import java.util.HashSet;
import java.util.Set;


public class circularDetection {
    
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
         this.data = data;
         this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

     static boolean detectLoop(Node head) {
         Set<Node> set = new HashSet<>();
 
         while(head != null) {
             if(set.contains(head))
             return true;
 
             set.add(head);
 
             head = head.next;
         }
         return false;
     }
     

    
    // public void addLast(int data) {
    //     Node newNode = new Node(data);
    //     if(head == null) {
    //         head = newNode;
    //         return;
    //     }

    //     Node currNode = head;
    //     while(currNode.next != null) {
    //         currNode = currNode.next;
    //     }
    //     currNode.next = newNode;
    // }

    // public void printList() {
    //     if(head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }

    //     Node currNode = head;
    //     while(currNode != null) {
    //         System.out.print(currNode.data + "->");
    //         currNode = currNode.next;
    //     }
    //     System.out.println("NULL");
    // }

    // public boolean hasCycle() {
    //     if(head == null) {
    //         return false;
    //     }
    //     Node hare = head;
    //     Node turtle = head;

    //     while(hare != null && hare.next != null) {
    //         hare = hare.next.next;
    //         turtle = turtle.next;

    //         if(hare == turtle) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        // circularDetection list = new circularDetection();
        // list.addLast(1);
        // list.addLast(8);
        // list.addLast(3);
        // list.addLast(2);
        // list.addLast(4);

        // System.out.println("list is::");
        // list.printList();

        // if(list.hasCycle()) {
        //     System.out.println("The list has cycle");
        // }
        // else {
        //     System.out.println("The list has not cycle.");
        // }

        Node head = new circularDetection().new Node(10);
        head.next = new circularDetection().new Node(20);
        head.next.next = new circularDetection().new Node(30);
        head.next.next.next = new circularDetection().new Node(40);
        head.next.next.next.next = new circularDetection().new Node(50);
        head.next.next.next.next.next = new circularDetection().new Node(60);


        head.next.next.next.next = head;

        if (detectLoop(head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }
}
