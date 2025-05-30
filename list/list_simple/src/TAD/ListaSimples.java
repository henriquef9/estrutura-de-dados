package TAD;

import java.lang.reflect.Array;

public class ListaSimples<T> {

    public int size;
    public T[] elements;

    public ListaSimples(Class<T> clazz, int size) {
        this.size = size;
        this.elements = (T[]) Array.newInstance(clazz, size);
    }

    public T insert(T element, int positon) {
        if (positon >= 0 && positon < this.size) {
            elements[positon] = element;
            return element;
        }else {
            return null;
        }
    }

    public T remove(int position) {
        if (position >= 0 && position < this.size) {
            T element = elements[position];
            elements[position] = null;
            return element;
        }else {
            return null;
        }
    }

    public T get(int position){
        return elements[position];
    }
}

