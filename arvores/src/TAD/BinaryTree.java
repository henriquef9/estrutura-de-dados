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

    public void insert(T element){
        No<T> novo = new No<>(element);

        No<T> current = this.raiz;
        No<T> parent = null;
        while(current != null){
            if(element.compareTo(current.getElement()) < 0){
                parent = current;
                current = current.getLeft();
            }else if(element.compareTo(current.getElement()) >= 0){
                parent = current;
                current = current.getRight();
            }
        }

        if(parent == null){
            this.raiz = novo;
        }else if(element.compareTo(parent.getElement()) < 0){
            parent.setLeft(novo);
        }else{
            parent.setRight(novo);
        }

        this.size++;
    }

    public No<T> search(T element){
        No<T> current = this.raiz;
        while(current != null && current.getElement().compareTo(element) != 0){
            if(current.getElement().compareTo(element) < 0){
                current = current.getLeft();
            }else{
                current = current.getRight();
            }
        }
        return current;
    }

    public T remove(T element){
        No<T> current = this.raiz;
        No<T> parent = null;
        while(current != null && element.compareTo(current.getElement()) != 0){
            if(element.compareTo(current.getElement()) < 0){
                parent = current;
                current = current.getLeft();
            }else{
                parent = current;
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
                    current = current.getRight();
                    parent.setLeft(current);
                }else {
                    current = current.getRight();
                    parent.setRight(current);
                }
            }else if(current.getRight() == null){
                if(current == this.raiz){
                    this.raiz = current.getLeft();
                }else if(parent.getLeft() == current){
                    current = current.getLeft();
                    parent.setLeft(current);
                }else{
                    current = current.getLeft();
                    parent.setRight(current);
                }
            }else{
                // Encontrar o sucessor (menor valor da subárvore direita)
                No<T> successor = current.getRight();
                No<T> parentSuccessor = current;
                while(successor.getLeft() != null){
                    parentSuccessor = successor;
                    successor = successor.getLeft();
                }
                parentSuccessor.setLeft(successor.getRight());
                current.setElement(successor.getElement());
            }

            this.size--;
            return remove_element;
        }

        return null;
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
