package TAD;

public class Queue<T> {

    private No<T> fist;
    private No<T> last;
    private int size;

    public Queue() {
        this.fist = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(T element) {
        if(this.isEmpty()) {
            this.fist = new No<T>(element);
            this.last = this.fist;
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
            T element = this.fist.getElement();
            if(this.size == 1){
                this.fist = null;
                this.last = null;
            }else {
                this.fist = this.fist.getNext();
            }
            this.size--;
            return element;
        }
    }

    public void print() {
        No<T> current = this.fist;
        while(current != null){
            System.out.println(current.getElement());
            current = current.getNext();
        }

    }
}
