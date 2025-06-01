package TAD;

public class No<T extends Comparable<T>> implements Comparable<No<T>> {

    private T element;
    private No<T> left;
    private No<T> right;

    public No(T element){
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public int compareTo(No<T> no){
        return this.element.compareTo(no.getElement());
    }

    public T getElement(){
        return this.element;
    }

    public No<T> getLeft(){
        return this.left;
    }

    public No<T> getRight(){
        return this.right;
    }

    public void setElement(T element){
        this.element = element;
    }

    public void setLeft(No<T> left){
        this.left = left;
    }

    public void setRight(No<T> right){
        this.right = right;
    }



}
