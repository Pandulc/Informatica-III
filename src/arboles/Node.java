package arboles;

public class Node<AnyType> {

    private AnyType element;
    private Node<AnyType> left;
    private Node<AnyType> right;


    public Node() {
    }

    public Node(AnyType element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public AnyType getElement() {
        return element;
    }

    public void setElement(AnyType element) {
        this.element = element;
    }

    public Node<AnyType> getLeft() {
        return left;
    }

    public void setLeft(Node<AnyType> left) {
        this.left = left;
    }

    public Node<AnyType> getRight() {
        return right;
    }

    public void setRight(Node<AnyType> right) {
        this.right = right;
    }
}
