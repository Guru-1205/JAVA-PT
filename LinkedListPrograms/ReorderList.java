package Interview_Questions.LinkedListPrograms;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReorderList {
    Node head;

    public ReorderList() {
        this.head = null;
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
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

    public void reorder() {
        // finding the middle node
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // separating the first and second list
        Node second = slow.next;
        slow.next = null;

        // reversing the second half of the linked list
        Node prev = null;
        Node curr = second;
        while (curr != null) {
            second = second.next;
            curr.next = prev;
            prev = curr;
            curr = second;
        }

        // interleaving the first and second linked list
        second = prev;
        Node first = head;
        Node curr1, curr2;
        while (second != null) {
            curr1 = first.next;
            curr2 = second.next;
            second.next = first.next;
            first.next = second;
            first = curr1;
            second = curr2;
        }
    }

    public static void main(String[] args) {
        ReorderList l1 = new ReorderList();
        l1.insertAtStart(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.insertAtEnd(40);
        l1.insertAtStart(5);
        System.out.println("The elements of the linked list : ");
        l1.display();
        l1.reorder();
        System.out.println("The list after reordering :");
        l1.display();

    }
}
