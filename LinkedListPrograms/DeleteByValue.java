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

    LinkedList() {
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

    public void delete(int data) {
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                prev.next = temp.next;
                temp.next = null;
                temp = prev.next;
            } else {
                prev = temp;
                temp = temp.next;
            }

        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }
}

public class DeleteByValue {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtStart(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.insertAtEnd(20);
        System.out.println("The elements of the linked list :");
        l.display();
        l.delete(20);
        System.out.println("The elements of the linked list :");
        l.display();
    }
}
