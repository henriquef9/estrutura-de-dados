import TAD.BinaryTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(7);
        tree.insert(12);
        tree.insert(17);
        tree.insert(20);
        tree.insert(18);
        tree.insert(25);
        tree.insert(30);

        System.out.println("---------------- Pre-Order");
        tree.preOrder();
        System.out.println();
        System.out.println("---------------- In-Order");
        tree.inOrder();
        System.out.println();
        System.out.println("---------------- Post-Order");
        tree.posOrder();
        System.out.println();

        System.out.println("----------------------");
        System.out.println(tree.remove(10));
        System.out.println(tree.remove(15));
        System.out.println("----------------------");

        System.out.println("---------------- Pre-Order");
        tree.preOrder();
        System.out.println();
        System.out.println("---------------- In-Order");
        tree.inOrder();
        System.out.println();
        System.out.println("---------------- Post-Order");
        tree.posOrder();
        System.out.println();


    }
}