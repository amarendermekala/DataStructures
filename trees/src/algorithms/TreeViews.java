package algorithms;

import entities.BinaryTree;
import entities.MaxLevel;
import entities.Node;
import entities.QItem;
import utils.BTreePrinter;
import utils.BinaryTreeFactory;

import java.util.*;

public class TreeViews {

    public static void main(String[] args) throws CloneNotSupportedException {
        TreeViews tv = new TreeViews();
        Node<Integer> root = BinaryTreeFactory.getSampleTreeRoot1();
        BinaryTree<Integer> bt = BinaryTreeFactory.getTree1(); //new BinaryTree<>(root);
        BTreePrinter.printNode(bt);

        Node<Integer> dummytree = new Node<>(1);

        System.out.println("---------------------Top View--------------------------");
        tv.printTopView(bt);
        System.out.println("\n----------------------Left View------------------------");
        tv.printLeftView(bt);
        System.out.println("\n----------------------Right View------------------------");
        tv.printRightView(bt);
        System.out.println("\n----------------------Right View Recursion------------------------");
        MaxLevel maxLevel = new MaxLevel(); // or class variable can be used but the method should be in class
        maxLevel.max_level = Integer.MIN_VALUE;
        printRightViewRecursion(bt.root, 1, maxLevel);
        System.out.println("\n----------------------Bottom View------------------------");
        printBottomView(bt);
    }

    private void printTopView(BinaryTree<Integer> binaryTree) throws CloneNotSupportedException {
        Node<Integer> root = binaryTree.getRoot();
        if (root == null) {
            return;
        }

        Queue<QItem> nodes = new LinkedList<>();
        nodes.add(new QItem<>(0, root));

        List<QItem> finalList = new ArrayList<>();
        List<Integer> heights = new ArrayList<>();

        while (!nodes.isEmpty()) {
            QItem item = nodes.poll();
            Node temp = item.node;

            if (!heights.contains(item.horizontalHeightFromRoot)) {
                finalList.add(item);
                System.out.print(item.node.value+ ", ");
                heights.add(item.horizontalHeightFromRoot);
            }

            if (temp.left != null) {
                nodes.add(new QItem(item.horizontalHeightFromRoot - 1, temp.left));
            }
            if (temp.right != null) {
                nodes.add(new QItem(item.horizontalHeightFromRoot + 1, temp.right));
            }

        }

        System.out.println("\n---------------Top View Left to Right-----------------");
        Comparator<QItem> leftToRight = Comparator.comparing(QItem::getHorizontalHeightFromRoot);
        Collections.sort(finalList, leftToRight);
        finalList.stream().map(item -> item.node.value + " ").forEach(System.out::print);
    }


    private void printLeftView(BinaryTree<Integer> binaryTree) throws CloneNotSupportedException {
        Node<Integer> root = binaryTree.getRoot();
        if (root == null) {
            return;
        }
        Queue<QItem> nodes = new LinkedList<>();
        nodes.add(new QItem<>(0, root));

        int maxLevel = Integer.MIN_VALUE;
        while(!nodes.isEmpty()) {
            QItem item = nodes.poll();
            Node temp = item.node;

            if(item.horizontalHeightFromRoot > maxLevel) {
                maxLevel = item.horizontalHeightFromRoot;
                System.out.print(item.node.value + ", ");
            }

            if (temp.left != null) {
                nodes.add(new QItem(item.horizontalHeightFromRoot + 1, temp.left));
            }
            if (temp.right != null) {
                nodes.add(new QItem(item.horizontalHeightFromRoot + 1, temp.right));
            }
        }
    }

    private void printRightView(BinaryTree<Integer> binaryTree) throws CloneNotSupportedException {
        Node<Integer> root = binaryTree.getRoot();
        if (root == null) {
            return;
        }

        Queue<QItem> nodes = new LinkedList<>();
        nodes.add(new QItem<>(0, root));
        Map<Integer, Node<Integer>> integerNodeTreeMap = new TreeMap<>();

        int maxLevel = Integer.MIN_VALUE;
        while(!nodes.isEmpty()) {
            QItem item = nodes.poll();
            Node temp = item.node;

            if(item.horizontalHeightFromRoot >= maxLevel) {
                maxLevel = item.horizontalHeightFromRoot;
                integerNodeTreeMap.put(maxLevel, item.node);
            }

            if (temp.left != null) {
                nodes.add(new QItem(item.horizontalHeightFromRoot + 1, temp.left));
            }
            if (temp.right != null) {
                nodes.add(new QItem(item.horizontalHeightFromRoot + 1, temp.right));
            }
        }

        integerNodeTreeMap.entrySet().stream().map(entry -> entry.getValue().value + ", ").forEach(System.out::print);
    }

    private static void printRightViewRecursion(Node node, int level, MaxLevel maxLevel) {

        // Use Max Level object or use a class level variable

        // Base Case
        if (node == null)
            return;

        // If this is the last Node of its level
        if (maxLevel.max_level < level) {
            System.out.print(node.value + ", ");
            maxLevel.max_level = level;
        }

        // Recur for right subtree first, then left subtree
        printRightViewRecursion(node.right, level + 1, maxLevel);
        printRightViewRecursion(node.left, level + 1, maxLevel);
    }

    private static void printBottomView(BinaryTree<Integer> binaryTree) throws CloneNotSupportedException {

        Node<Integer> root = binaryTree.getRoot();
        if (root == null) {
            return;
        }

        Queue<QItem> nodes = new LinkedList<>();
        nodes.add(new QItem<>(0, root));

        Map<Integer, Node> integerNodeMap = new TreeMap<>();

        while (!nodes.isEmpty()) {
            QItem item = nodes.poll();
            Node temp = item.node;
            integerNodeMap.put( item.horizontalHeightFromRoot, temp);

            if (temp.left != null) {
                nodes.add(new QItem(item.horizontalHeightFromRoot - 1, temp.left));
            }
            if (temp.right != null) {
                nodes.add(new QItem(item.horizontalHeightFromRoot + 1, temp.right));
            }

        }

        integerNodeMap.entrySet().stream().map(entry -> entry.getValue().value + ", ").forEach(System.out::print);
    }


}
