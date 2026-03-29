package BinarySearchTree;
class TreeNode2 {
    int data;
    TreeNode2 left, right;

    TreeNode2(int value) {
        data = value;
        left = right = null;
    }
}


public class BTSMinMax {
    public static int findMin(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Find Maximum
    public static int findMax(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        System.out.println("Minimum: " + findMin(root));
        System.out.println("Maximum: " + findMax(root));
    }
}

