package DSA;

public class LLIsPalindrome { 

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


    public Node reverse(Node head) {
       Node prevNode = null;
       Node currNode = head; 

       while(currNode != null) {
        Node next = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = next;
       }
       return prevNode;
    }

    public Node findMiddle(Node head) {
        Node hare = head;
        Node turtle = head;

        while(hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean Palindrome() {
     if(head == null || head.next == null) {
        return true;
     }  
     Node middle = findMiddle(head);
     Node secondHalfStart = reverse(middle.next);

     Node firstHalfStart = head;
     while(secondHalfStart != null) {
        if(firstHalfStart.data != secondHalfStart.data) {
            return false;
        }
        firstHalfStart = firstHalfStart.next;
        secondHalfStart = secondHalfStart.next;
     }
     return true;
    }

    public static void main(String[] args) {
        LLIsPalindrome list = new LLIsPalindrome();
        list.addLast(1);
        list.addLast(8);
        list.addLast(3);
        list.addLast(2);
        list.addLast(4);

        System.out.println("list is::");
        list.printList();

        if(list.Palindrome()) {
            System.out.println("The list is a palindrome.");
        }
        else {
            System.out.println("The list is not a palindrome.");
        }
    }
}
