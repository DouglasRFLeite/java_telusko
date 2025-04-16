package structures;

public class BinaryTree {

    Node root;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(3);
        binaryTree.insert(2);
        binaryTree.insert(4);

        binaryTree.show();
        /*
         * Data: 2 Left: NULL Right: NULL
         * Data: 3 Left: 2 Right: 4
         * Data: 4 Left: NULL Right: NULL
         */

    }

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        public String toString() {
            return "Data: " + this.data + " Left: " + (this.left == null ? "NULL"
                    : this.left.data) + " Right: " + (this.right == null ? "NULL" : String.valueOf(this.right.data));
        }
    }

    private Node insert(Node parent, int data) {
        if (parent == null) {
            parent = new Node(data);
        } else if (data < parent.data) {
            parent.left = insert(parent.left, data);
        } else if (data > parent.data) {
            parent.right = insert(parent.right, data);
        }
        return parent;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public void show() {
        if (root != null)
            inorderRecursive(root);
        else
            System.out.println("Árvore vazia");
    }

    private void inorderRecursive(Node parent) {
        if (parent.left != null) {
            inorderRecursive(parent.left);
        }

        System.out.println(parent);

        if (parent.right != null) {
            inorderRecursive(parent.right);
        }
    }

}
