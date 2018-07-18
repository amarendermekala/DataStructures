package utils;

import entities.BinaryTree;
import entities.Node;

public class BinaryTreeFactory {

    public static Node<Integer> getSampleTreeRoot1() {
        Node<Integer> root = new Node<Integer>(2);
        Node<Integer> n11 = new Node<Integer>(7);
        Node<Integer> n12 = new Node<Integer>(5);
        Node<Integer> n21 = new Node<Integer>(2);
        Node<Integer> n22 = new Node<Integer>(6);
        Node<Integer> n23 = new Node<Integer>(3);
        Node<Integer> n24 = new Node<Integer>(6);
        Node<Integer> n31 = new Node<Integer>(5);
        Node<Integer> n32 = new Node<Integer>(8);
        Node<Integer> n33 = new Node<Integer>(4);
        Node<Integer> n34 = new Node<Integer>(5);
        Node<Integer> n35 = new Node<Integer>(8);
        Node<Integer> n36 = new Node<Integer>(4);
        Node<Integer> n37 = new Node<Integer>(5);
        Node<Integer> n38 = new Node<Integer>(8);

        root.left = n11;
        root.right = n12;

        n11.left = n21;
        n11.right = n22;
        n12.left = n23;
        n12.right = n24;

        n21.left = n31;
        n21.right = n32;
        n22.left = n33;
        n22.right = n34;
        n23.left = n35;
        n23.right = n36;
        n24.left = n37;
        n24.right = n38;

        return root;
    }

    public static BinaryTree<Integer> getTree1() {
        BinaryTree<Integer> binTree = new BinaryTree<>(null);

        binTree.addElement(6);
        binTree.addElement(2);
        binTree.addElement(5);
        binTree.addElement(7);
        binTree.addElement(56);
        binTree.addElement(23);
        binTree.addElement(28);
        binTree.addElement(99);
        binTree.addElement(12);
        binTree.addElement(77);
        binTree.addElement(87);
        binTree.addElement(78);
        binTree.addElement(90);
        binTree.addElement(00);
        binTree.addElement(11);
        binTree.addElement(22);
        binTree.addElement(20);

        return binTree;

    }
}
