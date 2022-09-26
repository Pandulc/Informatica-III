package util;

public class listNode<AnyType> {
    public AnyType element;

    public listNode next;

    public listNode(AnyType x) {
        element = x;
    }

    public listNode(AnyType x, listNode<AnyType> n) {
        element = x;
        next = n;
    }

}
