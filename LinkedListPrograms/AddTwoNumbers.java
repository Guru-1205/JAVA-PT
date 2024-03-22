package Interview_Questions.LinkedListPrograms;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddTwoNumbers {
    Node head;

    public AddTwoNumbers() {
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

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }

    public Node add(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
        int x, y, sum, carry = 0;
        while (l1 != null || l2 != null) {
            x = (l1 != null) ? l1.data : 0;
            y = (l2 != null) ? l2.data : 0;
            sum = carry + x + y;
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry > 0) {
            current.next = new Node(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers l1 = new AddTwoNumbers();
        l1.insertAtStart(1);
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtEnd(9);

        AddTwoNumbers l2 = new AddTwoNumbers();
        l2.insertAtStart(9);
        l2.insertAtEnd(7);
        l2.insertAtEnd(8);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        Node res = addTwoNumbers.add(l1.head, l2.head);
        addTwoNumbers.display(res);
    }
}
