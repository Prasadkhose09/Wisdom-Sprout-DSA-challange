 import java.util.Stack;
 public class DayTwentyone {
   


    public void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;


        int top = stack.pop();

        reverseStack(stack);


        insertAtBottom(stack, top);
    }



    private void insertAtBottom(Stack<Integer> stack, int val) {

        if (stack.isEmpty()) {


            stack.push(val);
            return;



        }
        int top = stack.pop();

        insertAtBottom(stack, val);


        stack.push(top);

    }

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        DayTwentyone res = new DayTwentyone();
        res.reverseStack(stack);

        System.out.println(stack);
        
    }

    
}
