package TAD;

public class Lista {

    public int size;
    public int[] elements;

    public Lista(int size) {
        this.size = size;
        this.elements = new int[size];
    }

    public int insert(int element, int positon) {
        if (positon >= 0 && positon < this.size) {
            elements[positon] = element;
            return element;
        }else {
            return -1;
        }
    }

    public int remove(int position) {
        if (position >= 0 && position < this.size) {
            int element = elements[position];
            elements[position] = 0;
            return element;
        }else {
            return -1;
        }
    }
}

