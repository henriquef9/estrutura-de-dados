package TAD;

public class Queue<T> {

    /**
     * Represents the reference to the first*/
    private No<T> first;
    private No<T> last;
    private int size;

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(T element) {
        if(this.isEmpty()) {
            this.first = new No<T>(element);
            this.last = this.first;
        }else{
            this.last.setNext(new No<T>(element));
            this.last= this.last.getNext();
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
            }else {
                this.first = this.first.getNext();
            }
            this.size--;
            return element;
        }
    }

    public void print() {
        No<T> current = this.first;
        while(current != null){
            System.out.println(current.getElement());
            current = current.getNext();
        }

    }
}
