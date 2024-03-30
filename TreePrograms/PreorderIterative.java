package Interview_Questions.TreePrograms;

import java.util.*;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class PreorderIterative {

    public static void traversal(Node root) {
        if (root == null)
            return;
        Stack<Node> st = new Stack<Node>();
        Node current = root;
        st.push(current);
        while (!st.empty()) {
            current = st.pop();
            System.out.printf("%d ", current.data);
            if (current.right != null)
                st.push(current.right);
            if (current.left != null)
                st.push(current.left);
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
