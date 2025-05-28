package TAD;

public class LinkedList {

    public No first;
    public No last;
    public int size;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void addFirst(String element){
        No novo = new No(element);
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

    public void addLast(String element){
        No novo = new No(element);
        if(this.isEmpty()){
            this.first = novo;
            this.last = novo;
        }else{
            this.last.setNext(novo);
            this.last = novo;
        }

        this.size++;
    }

    public String removeFirst(){
        if(this.isEmpty()){
            return null;
        }else{
            String element = this.first.getElement();
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

    public String removeLast(){
        if(this.isEmpty()){
            return null;
        }else{
            String element = this.last.getElement();
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
