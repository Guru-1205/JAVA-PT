package Interview_Questions.LinkedListPrograms;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Palindrome {
    Node head;

    Palindrome() {
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

    public void palin() {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node first = head;
        Node second = slow.next;
        slow.next = null;
        Node prev = null;
        Node curr = second;
        while (curr != null) {
            curr = curr.next;
            second.next = prev;
            prev = second;
            second = curr;
        }
        second = prev;
        boolean flag = true;
        while (second != null) {
            if (first.data != second.data) {
                flag = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        System.out.println((flag) ? "Palindrome" : "Not palindrome");
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Palindrome l1 = new Palindrome();
        l1.insertAtStart(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(10);
        l1.insertAtEnd(5);
        l1.insertAtStart(5);
        System.out.println("The elements of the linked list : ");
        l1.display();
        l1.palin();

    }
}
