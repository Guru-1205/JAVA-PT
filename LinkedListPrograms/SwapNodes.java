package Interview_Questions.LinkedListPrograms;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head.next = null;
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

    public void swap() {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node curr = head;

        // Check if curr and curr.next are not null before accessing curr.next.next
        while (curr != null && curr.next != null) {
            Node second = curr.next;
            Node nextPair = second.next;

            // Perform the swap
            second.next = curr;
            prev.next = second;
            curr.next = nextPair;

            // Move to the next pair of nodes
            prev = curr;
            curr = nextPair;
        }
        head = dummy.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }
}

public class SwapNodes {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtStart(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(10);
        l1.insertAtEnd(5);
        l1.insertAtStart(5);
        System.out.println("The elements of the linked list : ");
        l1.swap();
        l1.display();
    }
}
