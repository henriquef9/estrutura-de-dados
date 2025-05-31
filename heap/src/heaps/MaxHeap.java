package heaps;

public class MaxHeap {

    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.heap = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public void insert(int value) {

        if(this.size >= this.capacity) {
            throw new RuntimeException("Heap is full");
        }else{
            this.heap[this.size] = value;
            this.size++;

            int index = this.size - 1;
            while(index != 0 && this.heap[this.parent(index)] < this.heap[index]){
                this.swap(parent(index), index);
                index = this.parent(index);
            }
        }

    }


    public int extractMax() {
        if(this.size == 0) {return -1;}

        int max = this.heap[0];
        this.heap[0] = this.heap[this.size - 1];
        this.size--;

        heapify(0);
        return max;
    }

    public int peek(){
        if(this.size == 0) {return -1;}
        return heap[0];
    }

    private void heapify(int index) {

        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if(right < this.size && this.heap[largest] < this.heap[right]) {
            largest = right;
        }

        if(left < this.size && this.heap[largest] < this.heap[left]) {
            largest = left;
        }

        if(largest != index){
            this.swap(largest, index);
            heapify(largest);
        }
    }

    private void swap(int index1, int index2) {
        int temp = this.heap[index1];
        this.heap[index1] = this.heap[index2];
        this.heap[index2] = temp;
    }

    private int parent(int index) { return (index - 1) / 2; }
    private int leftChild(int index) { return 2 * index + 1; }
    private int rightChild(int index) { return 2 * index + 2; }

    public void printHeap() {
        System.out.print("Heap: ");
        for (int i = 0; i < size; i++) {
            System.out.print(i+"-"+heap[i] + " ");
        }
        System.out.println();
    }

}
