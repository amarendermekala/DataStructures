package algorithms;

import entities.BinaryTree;
import entities.Node;
import utils.BTreePrinter;
import utils.BinaryTreeFactory;

public class Traversals {

    public static void main(String[] args) throws CloneNotSupportedException {
        Node<Integer> root = BinaryTreeFactory.getSampleTreeRoot1();
        BinaryTree<Integer> bt = new BinaryTree<>(root);
        BTreePrinter.printNode(bt);

        System.out.println("\n --------------Pre Order----------------");
        preOrderTraversal(root);
        System.out.println("\n --------------In Order----------------");
        inOrderTraversal(root);
        System.out.println("\n --------------Post Order----------------");
        postOrderTraversal(root);
    }

    private static void preOrderTraversal(Node<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private static void inOrderTraversal(Node<Integer> root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }

    private static void postOrderTraversal(Node<Integer> root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }


    //          2
    //         / \
    //        /   \
    //       /     \
    //      /       \
    //      7       5
    //     / \     / \
    //    /   \   /   \
    //    2   6   3   6
    //   / \ / \ / \ / \
    //   5 8 4 5 8 4 5 8
    //
    // --------------Pre Order-----------------
    // 2 7 2 5 8 6 4 5 5 3 8 4 6 5 8
    // --------------In Order------------------
    // 5 2 8 7 4 6 5 2 8 3 4 5 5 6 8
    // --------------Post Order----------------
    // 5 8 2 4 5 6 7 8 4 3 5 8 6 5 2


}
