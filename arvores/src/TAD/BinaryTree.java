package TAD;

public class BinaryTree<T extends Comparable<T>> {

    private No<T> raiz;
    private int size;


    public BinaryTree(){
        this.raiz = null;
        this.size = 0;
    }

    public BinaryTree(No<T> raiz){
        this.raiz = raiz;
        this.size = 1;
    }

    // O critério de inserção é valor menor para esquerda e maior igual para direita
    public void insert(T element){
        this.raiz = insertRec(this.raiz, element);
        this.size++;
    }

    private No<T> insertRec(No<T> no, T element){
        if(no == null){
            return new No<>(element);
        }else if(element.compareTo(no.getElement()) < 0){
            no.setLeft(insertRec(no.getLeft(), element));
        }else{
            no.setRight(insertRec(no.getRight(), element));
        }
        return no;
    }

    public No<T> search(T element){
        return searchRec(this.raiz, element);
    }

    private No<T> searchRec(No<T> no, T element){
        if(no == null){
            return null;
        }else if(element.compareTo(no.getElement()) < 0){
            return searchRec(no.getLeft(), element);
        }else if(element.compareTo(no.getElement()) > 0){
            return searchRec(no.getRight(), element);
        }else{
            return no;
        }
    }

    public T remove(T element){
        No<T> current = this.raiz;
        No<T> parent = null;
        while(current != null && element.compareTo(current.getElement()) != 0){
            parent = current;
            if(element.compareTo(current.getElement()) < 0){
                current = current.getLeft();
            }else{
                current = current.getRight();
            }
        }

        if(current != null){
            T remove_element = current.getElement();
            if(current.getLeft() == null && current.getRight() == null){
                if(current == this.raiz){
                    this.raiz = null;
                }else if(parent.getLeft() == current){
                    parent.setLeft(null);
                }else{
                    parent.setRight(null);
                }
            }else if(current.getLeft() == null){
                if(current == this.raiz){
                    this.raiz = current.getRight();
                }else if(parent.getLeft() == current){
                    parent.setLeft(current.getRight());
                }else {
                    parent.setRight(current.getRight());
                }
            }else if(current.getRight() == null){
                if(current == this.raiz){
                    this.raiz = current.getLeft();
                }else if(parent.getLeft() == current){
                    parent.setLeft(current.getLeft());
                }else{
                    parent.setRight(current.getLeft());
                }
            }else{
                // Encontrar o sucessor (menor valor da subárvore direita)
                No<T> successor = current.getRight();
                No<T> parentSuccessor = current;
                while(successor.getLeft() != null){
                    parentSuccessor = successor;
                    successor = successor.getLeft();
                }

                if(parentSuccessor != current) {
                    parentSuccessor.setLeft(successor.getRight());
                } else {
                    parentSuccessor.setRight(successor.getRight());
                }

                current.setElement(successor.getElement());
            }

            this.size--;
            return remove_element;
        }

        return null;
    }

    public T minimum(){
        No<T> current = this.raiz;

        while(current.getLeft() != null) {
            current = current.getLeft();
        }

        return current.getElement();
    }

    public T maximum(){
        No<T> current = this.raiz;

        while(current.getRight() != null) {
            current = current.getRight();
        }

        return current.getElement();
    }


    public void preOrder(){
        this.preOrder(this.raiz);
    }

    private void preOrder(No<T> no){
        if(no != null){
            System.out.print(no.getElement()+" ");
            preOrder(no.getLeft());
            preOrder(no.getRight());
        }
    }

    public void inOrder(){
        this.inOrder(this.raiz);
    }

    private void inOrder(No<T> no){
        if(no != null){
            inOrder(no.getLeft());
            System.out.print(no.getElement()+" ");
            inOrder(no.getRight());
        }
    }

    public void posOrder(){
        this.posOrder(this.raiz);
    }

    private void posOrder(No<T> no){
        if(no != null){
            posOrder(no.getLeft());
            posOrder(no.getRight());
            System.out.print(no.getElement()+" ");
        }
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public No<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
