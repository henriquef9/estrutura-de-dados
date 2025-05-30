import TAD.LinkedList;
import TAD.ListaSimples;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       LinkedList<String> l1 = new LinkedList<>();

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

        System.out.println("--------------------------------------");
        l1.print();

        System.out.println(l1.get("F"));

        /*ListaSimples<Integer> l2 = new ListaSimples<>(Integer.class,10);

        l2.insert(1, 0);
        l2.insert(2, 1);
        l2.insert(3, 2);
        l2.insert(4, 3);

        for(int i = 0; i < l2.size; i++){
            System.out.println(l2.elements[i]);
        }

        l2.remove(2);

        for(int i = 0; i < l2.size; i++){
            System.out.println(l2.elements[i]);
        }*/



    }
}