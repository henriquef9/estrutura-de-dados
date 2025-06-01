package heaps;


import java.util.ArrayList;

public class MaxHeapGeneric<T extends Comparable<T>> {


    private ArrayList<T> heap;

    public MaxHeapGeneric() {
        this.heap = new ArrayList<>();
    }

    public void insert(T value) {
        this.heap.add(value);
        heapifyUp(this.heap.size() - 1);
    }


    public T extractMax() {
        if(this.heap.isEmpty()) {return null;}

        T max = this.heap.getFirst();
        T last = this.heap.removeLast();

        if(!this.heap.isEmpty()){
            this.heap.set(0, last);
            this.heapifyDown(0);
        }

        return max;
    }

    public T peek(){
        if(this.heap.isEmpty()) {return null;}
        return heap.getFirst();
    }

    private void heapifyUp(int index) {
        int parent = parent(index);
        if(parent >= 0 && this.heap.get(parent).compareTo(this.heap.get(index)) < 0) {
            this.swap(parent, index);
            heapifyUp(parent);
        }
    }

    private void heapifyDown(int index) {

        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if(right < this.heap.size() && this.heap.get(largest).compareTo(this.heap.get(right)) < 0 ) {
            largest = right;
        }

        if(left < this.heap.size() && this.heap.get(largest).compareTo(this.heap.get(left)) < 0) {
            largest = left;
        }

        if(largest != index){
            this.swap(largest, index);
            heapifyDown(largest);
        }
    }



    private void swap(int index1, int index2) {
        T temp = this.heap.get(index1);
        this.heap.set(index1, this.heap.get(index2));
        this.heap.set(index2, temp);
    }

    private int parent(int index) { return (index - 1) / 2; }
    private int leftChild(int index) { return 2 * index + 1; }
    private int rightChild(int index) { return 2 * index + 2; }

    public int size() {
        return this.heap.size();
    }

    public void printHeap() {
        System.out.print("Heap: ");
        for (int i = 0; i < this.heap.size(); i++) {
            System.out.println(i+"-"+heap.get(i).toString() + " ");
        }
        System.out.println();
    }

}
