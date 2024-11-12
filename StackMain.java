public class StackMain {
   public static void main(String[] args) throws StackException{
    DynamicStack stack = new DynamicStack(5); //This is dynamic so can input any size 
   //  CustomStack stack = new CustomStack(5); //giving stack is full message
    stack.push(34);
    stack.push(23);
    stack.push(35);
    stack.push(94);
    stack.push(99);
    stack.push(100);


    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop()); //for Exception
    


    
   } 
}
