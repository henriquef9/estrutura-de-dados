import heaps.*;

import java.util.List;

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

       /* MinHeap minHeap = new MinHeap(10);

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

        System.out.println(minHeap.peek());*/

      /*  MaxHeapGeneric<Integer> maxHeapGeneric = new MaxHeapGeneric<>();

        maxHeapGeneric.insert(12);
        maxHeapGeneric.insert(10);
        maxHeapGeneric.insert(15);
        maxHeapGeneric.insert(11);
        maxHeapGeneric.insert(1);
        maxHeapGeneric.insert(100);
        maxHeapGeneric.insert(120);
        maxHeapGeneric.insert(8);
        maxHeapGeneric.insert(1000);

        maxHeapGeneric.printHeap();

        System.out.println(maxHeapGeneric.extractMax());

        maxHeapGeneric.printHeap();

        System.out.println("----");
        System.out.println(maxHeapGeneric.peek());*/

        /* MaxHeapGeneric<String> maxHeapGeneric = new MaxHeapGeneric<>();

        maxHeapGeneric.insert("Antonio");
        maxHeapGeneric.insert("Maria");
        maxHeapGeneric.insert("Paulo");
        maxHeapGeneric.insert("Pedro");
        maxHeapGeneric.insert("Ana");
        maxHeapGeneric.insert("Caio");
        maxHeapGeneric.insert("Giovanna");
        maxHeapGeneric.insert("Mariana");
        maxHeapGeneric.insert("Daniela");
        maxHeapGeneric.insert("Lucas");
        maxHeapGeneric.insert("Bruna");
        maxHeapGeneric.insert("Jose");
        maxHeapGeneric.insert("Otávio");
        maxHeapGeneric.insert("Rafaela");
        maxHeapGeneric.insert("Josefina");
        maxHeapGeneric.insert("Vinicius");
        maxHeapGeneric.insert("Fabio");

        maxHeapGeneric.printHeap();

        System.out.println(maxHeapGeneric.extractMax());

        maxHeapGeneric.printHeap();

        System.out.println("----");
        System.out.println(maxHeapGeneric.peek()); */

         PriorityQueue<User> priorityQueue = new PriorityQueue<>();

        List<User> users = List.of(
                new User("Antonio", 22),
                new User("Maria", 20),
                new User("João", 36),
                new User("Ana", 25),
                new User("Pedro", 48),
                new User("Marcos", 65),
                new User("Julia", 21),
                new User("Lucas", 16),
                new User("Fernanda", 9),
                new User("Carlos", 12),
                new User("Pedro", 68),
                new User("Marcos", 25),
                new User("Marcos", 35),
                new User("Julia", 11),
                new User("Pedro", 5),
                new User("Marcos", 2),
                new User("Julia", 28),
                new User("Marcos", 75)
                );

        for (User user : users) {
            priorityQueue.enqueue(user, User.priority(user.getAge()));
        };

        priorityQueue.printQueue();

        System.out.println("-------------------------");

        for(int i = 0; i < users.size(); i++) {
            User user = priorityQueue.dequeue();
            System.out.println(user+" - "+User.priority(user.getAge()));
        }

        System.out.println("-------------------------");

        priorityQueue.printQueue();

    }

    public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static Priority priority(int age) {
            if(age > 50) {return Priority.OLD;}
            if(age > 18) {return Priority.ADULT;}
            return Priority.CHILD;
        }

    }
}