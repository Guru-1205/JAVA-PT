package Interview_Questions.TreePrograms;

import java.util.*;

public class LevelorderIterative {

    public static void traversal(Node root) {
        if (root == null)
            return;
        Queue<Node> qe = new LinkedList<Node>();
        Node current = root;
        qe.add(current);
        while (!qe.isEmpty()) {
            current = qe.poll();
            System.out.printf("%d ", current.data);
            if (current.left != null)
                qe.add(current.left);
            if (current.right != null)
                qe.add(current.right);
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
