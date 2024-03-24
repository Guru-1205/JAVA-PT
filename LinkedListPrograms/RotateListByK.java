package Interview_Questions.LinkedListPrograms;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RotateListByK {
    Node head;

    public RotateListByK() {
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

    public int len() {
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    // rotate by right
    public void rotate1(int k) {
        int length = len();
        int trav = length - k - 1;
        Node curr = head;
        while (trav > 0) {
            curr = curr.next;
            trav--;
        }
        Node second = curr.next;
        curr.next = null;
        Node secondTemp = second;
        while (secondTemp.next != null) {
            secondTemp = secondTemp.next;
        }
        secondTemp.next = head;
        head = second;
    }

    // rotate by right
    public void rotate2(int k) {
        int length = len();
        int trav = k - 1;
        Node temp = head;
        while (trav > 0) {
            temp = temp.next;
            trav--;
        }
        Node second = temp.next;
        temp.next = null;
        Node secondTemp = second;
        while (secondTemp.next != null) {
            secondTemp = secondTemp.next;
        }
        secondTemp.next = head;
        head = second;
    }

    public static void main(String[] args) {
        RotateListByK list = new RotateListByK();
        list.insertAtStart(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        // list.display();
        list.rotate1(2);
        list.display();
    }
}
