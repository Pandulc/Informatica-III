package colas;

public class arrayQueue<AnyType> {
    private AnyType theArray[];
    private int currentSize;
    private int front;
    private int back;

    private static final int DEFAULT_CAPACITY = 10;

    public arrayQueue() {
        theArray = (AnyType[]) new Object[DEFAULT_CAPACITY];
        makeEmpty();
    }

    public void makeEmpty() {
        currentSize = 0;
        back = -1;
        front = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public AnyType getFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cola vacia");
        }
        return theArray[front];
    }

    public AnyType dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cola vacia");
        }
        currentSize--;
        AnyType returnValue = theArray[front];
        front = increment(front);
        return returnValue;
    }

    public void enqueue(AnyType x) {
        if (currentSize == theArray.length) {
            doubleArray();
        }
        back = increment(back);
        theArray[back] = x;
        currentSize++;
    }

    private int increment(int x) {
        if (++x == theArray.length) {
            x = 0;
        }
        return x;
    }

    private void doubleArray() {
        AnyType[] newArray = (AnyType[]) new Object[theArray.length * 2];

        for (int i = 0; i < currentSize; i++, front = increment(front)) {
            newArray[i] = theArray[front];
        }

        theArray = newArray;
        front = 0;
        back = currentSize - 1;
    }
}
