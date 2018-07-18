package entities;

public class Node<T> implements Cloneable {
    public Node left;
    public Node right;
    public T value;

    public Node(T value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }
}
