package heaps;

public class PriorityQueue<T> {

    private MaxHeapGeneric<ElementPriority<T>> heap = new MaxHeapGeneric<ElementPriority<T>>();

    public void enqueue(T element, Priority priority) {
        heap.insert(new ElementPriority<>(element, priority));
    }

    public T dequeue() {
        return heap.extractMax().getElement();
    }

    public int size() {
        return heap.size();
    }

    public void printQueue() {
        heap.printHeap();
    }

}