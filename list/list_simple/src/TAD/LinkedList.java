package TAD;

public class LinkedList<T> {

    public No<T> first;
    public No<T> last;
    public int size;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void addFirst(T element){
        No<T> novo = new No<T>(element);
        if(this.isEmpty()){
            this.first = novo;
            this.last = novo;
        }
        else{
            novo.setNext(this.first);
            this.first = novo;
        }

        this.size++;
    }

    public void addLast(T element){
        No<T> novo = new No<T>(element);
        if(this.isEmpty()){
            this.first = novo;
            this.last = novo;
        }else{
            this.last.setNext(novo);
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
            }
            else{
                this.first = this.first.getNext();
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
            }
            else{
                No current = this.first;
                while(current.getNext() != this.last){
                    current = current.getNext();
                }
                this.last = current;
                this.last.setNext(null);
            }
            this.size--;
            return element;
        }
    }

    public T get(T element){
        No current = this.first;
        while(current != null){
            if(current.getElement() == element){
                return element;
            }
            current = current.getNext();
        }
        return null;
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
