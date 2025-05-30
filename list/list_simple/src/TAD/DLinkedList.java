package TAD;

public class DLinkedList<T> {

    private No<T> first;
    private No<T> last;
    private int size;

    public DLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void addFirst(T element){
        No<T> novo = new No<>(element);
        if(this.isEmpty()){
            this.first = novo;
            this.last = novo;
        }else{
            this.first.setPrevious(novo);
            novo.setNext(this.first);
            this.first = novo;
        }
        this.size++;
    }

    public void addLast(T element){
        No<T> novo = new No<>(element);
        if(this.isEmpty()){
            this.first = novo;
            this.last = novo;
        }else{
            this.last.setNext(novo);
            novo.setPrevious(this.last);
            this.last = novo;
        }
        this.size++;
    }

    public T removeFirst(){
        if(this.isEmpty()){
            return null;
        }else{
            T element = this.first.getElement();
            if(this.size == 1){
                this.first = null;
                this.last = null;
            }else{
                this.first = this.first.getNext();
                this.first.setPrevious(null);
            }
            this.size--;
            return element;
        }
    }

    public T removeLast(){
        if(this.isEmpty()){
            return null;
        }else{
            T element = this.last.getElement();
            if(this.size == 1){
                this.first = null;
                this.last = null;
            }else{
                this.last = this.last.getPrevious();
                this.last.setNext(null);
            }
            this.size--;
            return element;
        }
    }

    public T get(T element){
        No current = this.first;
        while (current != null){
            if(current.getElement() == element){
                return element;
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean update(T element, T element_old){
        No<T> current = this.first;
        while (current != null){
            if(current.getElement() == element_old){
                current.setElement(element);
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void print(){
        No current = this.first;
        while(current != null){
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

}
