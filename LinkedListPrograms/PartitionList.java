package Interview_Questions.LinkedListPrograms;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PartitionList {
    Node head;

    PartitionList() {
        this.head = null;
    }

    public void insertAtStart(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void insertAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.printf("%d ", curr.data);
            curr = curr.next;
        }

    }

    public Node[] partition(int target) {
        Node l1 = new Node(-1);
        Node l2 = new Node(-1);
        Node h1 = l1;
        Node h2 = l2;
        Node temp = head;
        while (temp != null) {
            if (temp.data < target) {
                l1.next = temp;
                l1 = l1.next;
                // System.out.println("l1:" + temp.data);
            } else {
                l2.next = temp;
                l2 = l2.next;
                // System.out.println("l2:" + temp.data);
            }
            temp = temp.next;
        }
        l1.next = null;
        l2.next = null;
        return new Node[] { h1.next, h2.next };

    }

    public static void main(String[] args) {
        PartitionList l1 = new PartitionList();
        l1.insertAtStart(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(10);
        l1.insertAtEnd(5);
        l1.insertAtStart(5);
        l1.display();
        System.out.println();
        Node[] arr = l1.partition(15);
        Node temp1 = arr[0];
        Node temp2 = arr[1];
        while (temp1 != null) {
            System.out.printf("%d ", temp1.data);
            temp1 = temp1.next;
        }
        System.out.println();
        while (temp2 != null) {
            System.out.printf("%d ", temp2.data);
            temp2 = temp2.next;
        }
    }
}
