package Interview_Questions.LinkedListPrograms;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesFromSortedLinkedList {

    Node head;

    public RemoveDuplicatesFromSortedLinkedList() {
        this.head = null;
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }

    public void removeDuplicates() {
        Node prev = head, curr = head.next, nxt = head.next;
        while (curr.next != null) {
            nxt = nxt.next;
            if (prev.data == curr.data) {
                prev.next = nxt;
                curr.next = null;
                curr = nxt;
            } else {
                prev = curr;
                curr = curr.next;
            }

        }

    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedLinkedList list = new RemoveDuplicatesFromSortedLinkedList();
        list.insertAtStart(1);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.removeDuplicates();
        list.display();
    }
}
