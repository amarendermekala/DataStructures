package algorithms;

import entities.BinaryTree;
import entities.Node;
import utils.BTreePrinter;

public class Mirrors {

    public static void main(String[] args) throws CloneNotSupportedException {
        Node root1 = new Node(1);
        Node root2 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.right.left = new Node(5);
        root2.right.right = new Node(4);

        BTreePrinter.printNode(new BinaryTree<>(root1));
        BTreePrinter.printNode(new BinaryTree<>(root2));


        if (areMirror(root1, root2) == true)
            System.out.println("Yes");
        else
            System.out.println("No");


        //     1
        //    / \
        //   /   \
        //   2   3
        //  / \
        //  4 5
        //
        //   1
        //  / \
        // /   \
        // 3   2
        //    / \
        //    5 4
        //
        // Yes

    }

    private static boolean areMirror(Node root1, Node root2) {
        if(root1 == null && root2 == null) {
            return true;
        }

        if(root1 == null || root2 == null) {
            return false;
        }

        return root1.value == root2.value && areMirror(root1.left, root2.right) && areMirror(root2.left, root1.right);
    }
}
