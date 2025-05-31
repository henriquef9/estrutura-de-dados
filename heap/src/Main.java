import heaps.MaxHeap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MaxHeap maxHeap = new MaxHeap(10);

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

    }
}