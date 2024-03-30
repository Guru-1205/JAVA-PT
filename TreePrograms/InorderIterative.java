package Interview_Questions.TreePrograms;

import java.util.Stack;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class InorderIterative {
    public static void traversal(Node root) {
        if (root == null)
            return;
        Stack<Node> st = new Stack<Node>();
        Node current = root;
        while (current != null || !st.empty()) {
            while (current != null) {
                st.push(current);
                current = current.left;
            }
            current = st.pop();
            System.out.printf("%d ", current.data);
            current = current.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        traversal(root);
    }
}
