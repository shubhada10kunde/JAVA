// find nth node from last + delete nth node

package DSA;

public class LL1 {

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

    public Node removeNthFromEnd(int n) {
        if(head.next == null) {
            return null;
        }

        // size
        int size = 0;
        Node currNode = head;
        while(currNode != null) {
            currNode = currNode.next;
            size++;
        }

        if(n == size) {
            return head.next;
        }

        // prev node
        int idxToSearch = size - n;
          Node prev = head;
          int i = 1;
          while(i < idxToSearch) {
            prev = prev.next;
            i++;
          }
          prev.next = prev.next.next;
          return head;
    }

    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println("Original List:");
        list.printList();

        list.removeNthFromEnd(2);

        System.out.println("List after removing 2nd node from the end:");
        list.printList();
    }
    
}
