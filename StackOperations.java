import java.util.Stack;
public class StackOperations{
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(23);
        stack.push(35);
        stack.push(94);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}