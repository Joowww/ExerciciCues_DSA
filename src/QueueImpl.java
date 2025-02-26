public class QueueImpl<E> implements Queue<E> {
    private E[] elements;
    private int pos;

    public QueueImpl(int len) {
        this.pos = 0;
        this.elements = (E[]) new Object[len];
    }

    private boolean Empty() {
        return pos == 0;
    }

    private boolean Full() {
        return pos >= elements.length;
    }

    private void shiftLeft() {
        for(int i =0; i<this.pos; i++)
        {
            this.elements[i]=this.elements[i+1];
        }
        this.pos--;
    }

    public void push(E e) throws FullQueueException {
        if (Full()) throw new FullQueueException();
        elements[pos++] = e;
    }
    public E pop() throws EmptyQueueException
    {
        if (Empty()) throw new EmptyQueueException();
        E firstElement = elements[0];
        shiftLeft();
        return firstElement;
    }

    public int size()
    {
        return pos;
    }
}
