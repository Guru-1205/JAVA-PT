package Interview_Questions.LinkedListPrograms;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CycleDetection {
    Node head;

    public CycleDetection() {
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

    public boolean cycle() {
        Node fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.data == slow.data)
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        CycleDetection list = new CycleDetection();
        list.insertAtStart(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        Node temp = list.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list.head.next;
        boolean hasCycle = list.cycle();
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }

}
