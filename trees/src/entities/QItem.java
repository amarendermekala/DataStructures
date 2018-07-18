package entities;

public class QItem<T> {
    public int horizontalHeightFromRoot;
    public Node<T> node;

    public QItem(int horizontalHeightFromRoot, Node<T> node) {
        this.horizontalHeightFromRoot = horizontalHeightFromRoot;
        this.node = node;
    }

    public int getHorizontalHeightFromRoot() {
        return horizontalHeightFromRoot;
    }

    public void setHorizontalHeightFromRoot(int horizontalHeightFromRoot) {
        this.horizontalHeightFromRoot = horizontalHeightFromRoot;
    }

    @Override
    public String toString() {
        return "QItem{" +
                "node=" + node.value +
                '}';
    }


}