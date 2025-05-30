package TAD;

public class CircleQueue<T> {
    private No<T> first;
    private No<T> last;
    private int size;

    public CircleQueue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void enqueue(T element) {
        No<T> novo = new No<>(element);
        if(this.isEmpty()){
            this.first = novo;
            this.last = novo;
        }else{
            this.last.setNext(novo);
            this.last = novo;
            this.last.setNext(this.first);
        }
        this.size++;
    }

    public T dequeue() {
        if(this.isEmpty()){
            return null;
        }else{
            T element = this.first.getElement();
            if(this.size == 1){
                this.first = null;
                this.last = null;
            }else{
                this.first = this.first.getNext();
                this.last.setNext(this.first);
            }
            this.size--;
            return element;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void print() {
        No<T> current = this.first;
        System.out.println(current.getElement());
        current = current.getNext();
        while(current != this.first){
            System.out.println(current.getElement());
            current = current.getNext();
        }

    }

}
