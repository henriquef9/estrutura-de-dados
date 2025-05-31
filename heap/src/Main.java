import heaps.MaxHeap;
import heaps.MinHeap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(5);
        maxHeap.insert(1);
        maxHeap.insert(100);
        maxHeap.insert(120);
        maxHeap.insert(8);

        maxHeap.printHeap();

        maxHeap.extractMax();

        maxHeap.printHeap();

        System.out.println(maxHeap.peek());

        */

        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(20);
        minHeap.insert(30);
        minHeap.insert(5);
        minHeap.insert(1);
        minHeap.insert(100);
        minHeap.insert(120);
        minHeap.insert(8);

        minHeap.printHeap();

        minHeap.extractMin();

        minHeap.printHeap();

        System.out.println(minHeap.peek());



    }
}