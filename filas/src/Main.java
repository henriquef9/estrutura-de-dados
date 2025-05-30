import Requests.Priority;
import Requests.QueueRequests;
import Requests.Request;
import TAD.CircleQueue;
import TAD.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      /*  Queue<String> queue = new Queue<>();

        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");
        queue.dequeue();
        queue.enqueue("6");

        queue.print();*/

       /* QueueRequests queueRequests = new QueueRequests();

        queueRequests.enqueue(  new Request("Solicitacao 1", Priority.Low));
        queueRequests.enqueue(  new Request("Solicitacao 2", Priority.Medium));
        queueRequests.enqueue(  new Request("Solicitacao 3", Priority.Low));
        queueRequests.enqueue(  new Request("Solicitacao 4", Priority.High));
        queueRequests.enqueue(  new Request("Solicitacao 5", Priority.Medium));
        queueRequests.enqueue(  new Request("Solicitacao 6", Priority.Low));

        queueRequests.print();
        System.out.println("---------------------------------------");
        queueRequests.dequeue();
        queueRequests.enqueue(  new Request("Solicitacao 7", Priority.High));
        queueRequests.dequeue();

        queueRequests.print();
        */

        CircleQueue<Integer> circleQueue = new CircleQueue<>();

        circleQueue.enqueue(1);
        circleQueue.enqueue(2);
        circleQueue.enqueue(3);
        circleQueue.enqueue(4);
        circleQueue.enqueue(5);

        circleQueue.dequeue();
        circleQueue.enqueue(6);
        circleQueue.dequeue();


        circleQueue.print();

    }
}