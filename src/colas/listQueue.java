package colas;

import util.listNode;

public class listQueue<AnyType> {
    private listNode<AnyType> front;
    private listNode<AnyType> back;

    public listQueue() {
        makeEmpty();
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void makeEmpty() {
        front = back = null;
    }

    public AnyType getFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cola vacia");
        }
        return front.element;
    }

    public AnyType dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cola vacia");
        }
        AnyType returnElement = front.element;
        front = front.next;
        return returnElement;
    }

    public void enqueue (AnyType x){
        if(isEmpty()){
            back=front=new listNode<>(x);
        }
        else {
            back = back.next = new listNode<>(x, back);
        }
    }


}
