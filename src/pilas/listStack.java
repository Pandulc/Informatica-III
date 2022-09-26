package pilas;

import util.listNode;

public class listStack<AnyType> {
    private listNode<AnyType> topOfStack;

    public listStack() {
        makeEmpty();
    }

    public boolean isEmpty() {
        return topOfStack == null;
    }

    public void makeEmpty() {
        topOfStack = null;
    }

    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Pila vacia");
        }
        topOfStack = topOfStack.next;
    }

    public AnyType top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Pila vacia");
        }
        return topOfStack.element;
    }

    public AnyType topAndPop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Pila vacia");
        }
        AnyType returnElement = topOfStack.element;
        this.pop();
        return returnElement;
    }

    public void push(AnyType x) {
        topOfStack = new listNode<>(x, topOfStack);
    }
}
