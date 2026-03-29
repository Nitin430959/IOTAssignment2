package BinarySearchTree;
class BTNode {
    int data;
    BTNode left, right;

    BTNode(int value) {
        data = value;
        left = right = null;
    }
}

public class CheckBST {
    static boolean isBST(BTNode root) {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean check(BTNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data <= min || node.data >= max) {
            return false;
        }

        return check(node.left, min, node.data) &&
                check(node.right, node.data, max);
    }

    public static void main(String[] args) {
        BTNode root = new BTNode(10);
        root.left = new BTNode(5);
        root.right = new BTNode(20);
        root.left.left = new BTNode(2);
        root.left.right = new BTNode(8);

        if (isBST(root)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Not a BST");
        }
    }
}

