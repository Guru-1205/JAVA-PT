package Interview_Questions.LinkedListPrograms;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveNthNodeFromTheLast {
    Node head;

    public RemoveNthNodeFromTheLast() {
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

    public void removeNthFromLast(int n) {
        Node slow = head, fast = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        Node dummy = new Node(0);
        Node prev = dummy;
        prev.next = head;
        while (fast != null) {
            slow = slow.next;
            prev = prev.next;
            fast = fast.next;
        }
        prev.next = slow.next;
        slow.next = null;

    }

    public static void main(String[] args) {
        RemoveNthNodeFromTheLast l = new RemoveNthNodeFromTheLast();
        l.insertAtStart(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.insertAtEnd(50);
        l.removeNthFromLast(2);
        l.display();
    }
}
