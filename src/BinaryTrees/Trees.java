class Node {
    char data;
    Node left, right;
    Node(char data) { this.data = data; }
}

public class Trees {
    void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " "); // Visit root FIRST
        preorder(root.left);               // Then left subtree
        preorder(root.right);              // Then right subtree
    }

    public static void main(String[] args) {
        Trees tree = new Trees();

        Node A = new Node('A');
        A.left       = new Node('B');
        A.right      = new Node('C');
        A.left.left  = new Node('D');
        A.left.right = new Node('E');

        System.out.print("Preorder: ");
        tree.preorder(A);  // Output: A B D E C
    }
}