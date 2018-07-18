package algorithms;

import entities.BinaryTree;
import entities.Node;
import utils.BTreePrinter;
import utils.BinaryTreeFactory;

public class PrintTrees {


    public static void main(String[] args) throws CloneNotSupportedException {
//        BinaryTree<Integer> bt = new BinaryTree<>(BinaryTreeFactory.getSampleTree1());
//        Node<Integer> root = BinaryTreeFactory.getSampleTree1();
//
//        BTreePrinter.printNode(bt);

        System.out.print("----------------------------------------------------------------------------\n");

        BinaryTree<Integer> binTree = new BinaryTree<>(null);

        binTree.addElement(6);
        binTree.addElement(2);
        binTree.addElement(2123);
        binTree.addElement(2);
        binTree.addElement(2);
        binTree.addElement(2123);
        binTree.addElement(2);
        binTree.addElement(2);
        binTree.addElement(2);
        binTree.addElement(2);
        binTree.addElement(2123);
        binTree.addElement(2);
        binTree.addElement(2);
        binTree.addElement(2);
        binTree.addElement(1232);
        binTree.addElement(2);
        binTree.addElement(2);

//        System.out.print(binTree.getRoot().getLeft().value);
        BTreePrinter.printNode(binTree);

    }

}
