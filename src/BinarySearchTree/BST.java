package BinarySearchTree;
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BST {
    TreeNode root;

    TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    void insertValue(int value) {
        root = insert(root, value);
    }

    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insertValue(50);
        tree.insertValue(30);
        tree.insertValue(70);
        tree.insertValue(20);
        tree.insertValue(40);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
    }
}

