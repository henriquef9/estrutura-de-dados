package TAD;

public class No {

    private String element;
    private No next;

    public No(String element){
        this.element = element;
        this.next = null;
    }

    public No(String element, No next){
        this.element = element;
        this.next = next;
    }

    public String getElement() {
        return element;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

}
