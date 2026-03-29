
class Node1 {
    char data;
    Node1 left, right;
    Node1(char data) { this.data = data; }
}

public class Trees1 {
    void postorder(Node1 root) {
        if (root == null) return;

        postorder(root.left);               // Then left subtree
        postorder(root.right);
        System.out.print(root.data + " ");// Then right subtree
    }

    public static void main(String[] args) {
        Trees1 tree = new Trees1();

        Node1 A = new Node1('A');
        A.left       = new Node1('B');
        A.right      = new Node1('C');
        A.left.left  = new Node1('D');
        A.left.right = new Node1('E');

        System.out.print("Preorder: ");
        tree.postorder(A);  // Output: A B D E C
    }
}