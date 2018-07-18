package entities;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

    public Node<T> root;

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() throws CloneNotSupportedException {
        return (Node<T>) root.clone();
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void addElement(T nodeValue) {
        if(root == null) {
            root = new Node<>(nodeValue);
            return;
        }
        Node<T> temp;
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);



        while(!nodes.isEmpty()) {
            temp = nodes.poll();

            if(temp.left == null) {
                temp.left = new Node<>(nodeValue);
                break;
            } else {
                nodes.add(temp.left);
            }

            if(temp.right == null) {
                temp.right = new Node<>(nodeValue);
                break;
            } else {
                nodes.add(temp.right);
            }
        }
    }


}
