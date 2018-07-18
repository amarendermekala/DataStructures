package algorithms;

import entities.BinaryTree;
import entities.Node;
import utils.BTreePrinter;
import utils.BinaryTreeFactory;

public class PrintTrees {


    public static void main(String[] args) throws CloneNotSupportedException {
        BinaryTree<Integer> bt = new BinaryTree<>(BinaryTreeFactory.getSampleTree1());
        Node<Integer> root = BinaryTreeFactory.getSampleTree1();

        BTreePrinter.printNode(bt);

    }

}
