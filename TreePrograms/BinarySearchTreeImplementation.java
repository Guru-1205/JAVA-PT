package Interview_Questions.TreePrograms;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTreeImplementation {
    public static boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        return search(root.left, key) || search(root.right, key);
    }

    public static Node delete(Node root, int key) {
        if (root == null)
            return null;
        if (root.data == key)
            return deleteNode(root);
        delete(root.left, key);
        delete(root.right, key);
        return root;
    }

    public static Node deleteNode(Node root) {
        if (root == null)
            return null;
        // case 1: No children
        if (root.left == null && root.right == null)
            return null;
        // case 2: one children
        if (root.left == null)
            return root.right;
        if (root.right == null)
            return root.left;
        // case 3: two children
        Node successor = minr(root);
        root.data = successor.data;
        root.right = delete(root.right, successor.data);
        return root;
    }

    public static Node minr(Node root) {
        Node temp = root.right;
        while (temp.left != null)
            temp = temp.left;
        return temp;
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.printf("%d ", root.data);
        inorder(root.right);
    }

    public static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);
        if (root.data < key)
            root.right = insert(root.right, key);
        else if (root.data > key)
            root.left = insert(root.left, key);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        if (search(root, 7))
            System.out.println("Element found in BST...!!!");
        else
            System.out.println("Element not found in BST");
        inorder(root);
        System.out.println();
        root = delete(root, 10);
        inorder(root);
        root = insert(root, 1);
        inorder(root);
    }
}
