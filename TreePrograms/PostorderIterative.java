package Interview_Questions.TreePrograms;

import java.util.Stack;

public class PostorderIterative {

    public static void traversal(Node root) {
        if (root == null)
            return;
        Stack<Node> st1 = new Stack<Node>();
        Stack<Node> st2 = new Stack<Node>();
        Node current = root;
        st1.push(current);
        while (!st1.empty()) {
            current = st1.pop();
            st2.push(current);
            if (current.left != null)
                st1.push(current.left);
            if (current.right != null)
                st1.push(current.right);
        }
        while (!st2.empty())
            System.out.printf("%d ", st2.pop().data);

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
