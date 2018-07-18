package entities;

public class BinaryTree<T> {

    Node<T> root;

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() throws CloneNotSupportedException {
        return (Node<T>) root.clone();
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }


}
