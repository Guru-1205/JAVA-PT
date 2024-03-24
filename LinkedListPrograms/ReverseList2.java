package Interview_Questions.LinkedListPrograms;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseList2 {
    Node head;

    public ReverseList2() {
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

    public void reverse2(int start, int end) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node stPtrPrev = dummy, endPtrNxt = dummy, endPtr = dummy, startPtr;
        while (start - 1 > 0) {
            stPtrPrev = stPtrPrev.next;
            start--;
        }
        startPtr = stPtrPrev.next;
        while (end + 1 > 0) {
            endPtr = endPtrNxt;
            endPtrNxt = endPtrNxt.next;
            end--;
        }
        endPtr.next = null;
        Node prev = null, nxt = startPtr;

        while (startPtr != null) {
            nxt = nxt.next;
            startPtr.next = prev;
            prev = startPtr;
            startPtr = nxt;
        }
        stPtrPrev.next.next = endPtrNxt;
        stPtrPrev.next = endPtr;
        head = dummy.next;
    }

    public static void main(String[] args) {
        ReverseList2 list = new ReverseList2();
        list.insertAtStart(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.reverse2(2, 4);
        list.display();
    }

}
