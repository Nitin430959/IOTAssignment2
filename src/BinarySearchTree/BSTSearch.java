package BinarySearchTree;
class TreeNode1 {
    int data;
    TreeNode left, right;

    TreeNode1(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTSearch {
    public static boolean search(TreeNode root, int key) {
        if (root == null) {
            return false; // not found
        }

        if (root.data == key) {
            return true; // found
        }

        if (key < root.data) {
            return search(root.left, key); // search left
        } else {
            return search(root.right, key); // search right
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        int key = 60;

        if (search(root, key)) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }
    }
}

