import TAD.LinkedList;
import TAD.Lista;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Lista lista = new Lista(10);

        //lista.insert(1, 0);
        //lista.insert(2, 1);

        //System.out.println(lista.elements[2]);

        LinkedList l1 = new LinkedList();

        l1.addFirst("A");
        l1.addFirst("B");
        l1.addLast("C");
        l1.addLast("D");
        l1.addLast("E");
        l1.addFirst("G");
        l1.addLast("F");

        l1.print();

        l1.removeFirst();
        l1.removeLast();

        l1.print();

    }
}