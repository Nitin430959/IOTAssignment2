package BinarySearchTree;
class Tree {
    int data;
    Tree left, right;

    Tree(int value) {
        data = value;
        left = right = null;
    }
}


public class BSTDelete {
    Tree insert(Tree root, int value) {
        if (root == null) return new Tree(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);

        return root;
    }

    Tree deleteNode(Tree root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {

            // No child
            if (root.left == null && root.right == null)
                return null;

            // One child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            // Two children
            Tree temp = findMin(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }

    Tree findMin(Tree root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    void inorder(Tree root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BSTDelete obj = new BSTDelete();
        Tree root = null;

        // Insert elements
        root = obj.insert(root, 50);
        root = obj.insert(root, 30);
        root = obj.insert(root, 70);
        root = obj.insert(root, 20);
        root = obj.insert(root, 40);
        root = obj.insert(root, 60);
        root = obj.insert(root, 80);

        System.out.print("Before deletion: ");
        obj.inorder(root);

        // Delete node
        root = obj.deleteNode(root, 50);

        System.out.print("\nAfter deletion: ");
        obj.inorder(root);
    }
}

