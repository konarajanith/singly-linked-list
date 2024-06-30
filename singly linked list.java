package datastrture;

public class fifo {
    // Node class for singly linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Singly linked list class
    static class SinglyLinkedList {
        Node head;

        // Append a new node at the end
        public void append(int data) {
            if (head == null) {
                head = new Node(data);
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }

        // Print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ,");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Main method to demonstrate the singly linked list
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.append(1);
        sll.append(2);
        sll.append(3);
        sll.printList();  
    }
}
