package TAD;

public class No<T> {
    private T element;
    private No<T> next;

    public No(T element) {
        this.element = element;
        this.next = null;
    }

    public No(T element, No<T> next) {
        this.element = element;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

}
