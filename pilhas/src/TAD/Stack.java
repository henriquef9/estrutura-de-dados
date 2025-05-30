package TAD;

public class Stack<T> {

    private No<T> top;
    private No<T> bottom;
    private int size;

    public Stack() {
        this.top = null;
        this.bottom = null;
        this.size = 0;
    }

    public void push(T element) {
        No<T> novo = new No<>(element);

        if(this.isEmpty()) {
            this.top = novo;
            this.bottom = novo;
        }else{
            novo.setNext(this.top);
            this.top = novo;
        }
        this.size++;
    }

    public T pop() {
        if(this.isEmpty()) {
            return null;
        }else{
            T element = this.top.getElement();
            if(this.size == 1) {
                this.bottom = null;
                this.top = null;
            }else{
                this.top = this.top.getNext();
            }
            this.size--;
            return element;
        }
    }

    public T peek() {
        if(this.isEmpty()) {
            return null;
        }else{
            return this.top.getElement();
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

}
