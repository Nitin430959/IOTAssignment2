package BinaryTrees;
class Node {
    char data;
    Node left, right;
    Node(char data) { this.data = data; }
}
public class BinaryTree {
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Node A = new Node('A');
        A.left  = new Node('B');
        A.right = new Node('C');
        A.left.left  = new Node('D');
        A.left.right = new Node('E');

        System.out.print("Inorder: ");
        tree.inorder(A);  // Output: D B E A C
    }
}

