package DSA;

public class ReverseLL {

    Node head;
    private int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }


    // add last
    public void addLast(int data) {
        Node newNode = new Node(data); 
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }
    // print list
    public void printList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    // public void reverseIterate() {
    //     if(head == null || head.next == null) {
    //         return;
    //     }
        
    //     Node prevNode = head;
    //     Node currNode = head.next;
    //     while(currNode != null) { 
    //         Node nextNode = currNode.next;
    //         currNode.next = prevNode;

    //         //update
    //         prevNode = currNode;
    //         currNode = nextNode;
    //     }
    //     head.next = null;
    //     head = prevNode;
    // }

    public Node reverseRecursiveLL(Node head) {
 
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursiveLL(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {

        ReverseLL list = new ReverseLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.head = list.reverseRecursiveLL(list.head);
        list.printList();

         
    }
    
}
