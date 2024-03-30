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

public class BinaryTreeImplementation {

    public static boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        return search(root.left, key) || search(root.right, key);
    }

    public static Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data == key) {
            return deleteNode(root);
        }
        root.left = delete(root.left, key);
        root.right = delete(root.right, key);
        return root;
    }

    public static Node deleteNode(Node root) {
        if (root == null)
            return null;

        // Case 1: Node to be deleted is a leaf node
        if (root.left == null && root.right == null) {
            System.out.println("Element found at the leaf node and deleted");
            return null;
        }
        // Case 2: Node to be deleted has only one child
        if (root.left == null) {
            System.out.println("Element has single child towards its right");
            return root.right;
        }
        if (root.right == null) {
            System.out.println("Element has single child towards its left");
            return root.left;
        }
        // Case 3: Node to be deleted has two children
        System.out.println("Element has two children - finding the inorder successor ....");
        Node successor = minr(root);
        root.data = successor.data;
        root.right = delete(root.right, successor.data);
        return root;
    }

    public static Node minr(Node root) {
        Node temp = root.right;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.printf("%d ", root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.printf("%d ", root.data);
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.printf("%d ", root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        if (search(root, 25))
            System.out.println("Element found in the tree..!!!");
        else
            System.out.println("Element not found in the tree");
        System.out.println("Tree before deletion:");
        preorder(root);
        System.out.println();
        delete(root, 10);
        System.out.println("Tree after deletion:");
        preorder(root);
    }
}
