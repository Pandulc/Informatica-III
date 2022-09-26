package pilas;

import java.util.Stack;

public class arrayStack<AnyType> {
    private AnyType[] theArray;
    private int topOfStack;

    private static final int DEFAULT_CAPACITY = 10;

    public arrayStack() {
        theArray = (AnyType[]) new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public void makeEmpty() {
        topOfStack = -1;
    }

    public AnyType top() throws Exception {
        if (isEmpty())
            throw new Exception("Pila vacia");

        return theArray[topOfStack];
    }

    public void pop() throws Exception {
        if (isEmpty())
            throw new Exception("Pila vacia");
        topOfStack--;
    }

    public AnyType topAndPop() throws Exception {
        if (isEmpty())
            throw new Exception("Pila vacia");

        return theArray[topOfStack--];
    }

    public void push(AnyType x){
        if(topOfStack + 1 == theArray.length ){
            doubleArray();
        }
        theArray[++topOfStack] = x;
    }

    private void doubleArray(){
        AnyType [] newArray = (AnyType[])new Object[theArray.length*2];

        for (int i = 0; i < theArray.length; i++) {
            newArray[i] = theArray[i];
        }

        theArray = newArray;

    }

}
