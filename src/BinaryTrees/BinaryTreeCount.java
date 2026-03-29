package BinaryTrees;
class BTNode {
    int data;
    BTNode left, right;

    BTNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreeCount {
    public static int countNodes(BTNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        // Creating binary tree
        BTNode root = new BTNode(1);
        root.left = new BTNode(2);
        root.right = new BTNode(3);
        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);

        int totalNodes = countNodes(root);
        System.out.println("Total number of nodes: " + totalNodes);
    }
}

