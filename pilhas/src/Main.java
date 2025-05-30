import TAD.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        String word = "ababaababa";

        int midx = word.length() / 2;

        if(word.length() % 2 == 0) {
            for(int i = 0; i < midx; i++) {
                stack.push(word.charAt(i));
            }

            for(int i = midx; i < word.length(); i++) {
                char popped = stack.pop();
                if(popped != word.charAt(i)){
                    System.out.println(popped + " != " + word.charAt(i));
                    break;
                }
            }
        }else{
            for(int i = 0; i <= midx; i++) {
                stack.push(word.charAt(i));
            }

            for(int i = midx; i < word.length(); i++) {
                char popped = stack.pop();
                if(popped != word.charAt(i)){
                    System.out.println(popped + " != " + word.charAt(i));
                    break;
                }
            }
        }

        if(stack.isEmpty()) {
            System.out.println("Palindromo");
        }else{
            System.out.println("Não Palindromo");
        }


    }
}