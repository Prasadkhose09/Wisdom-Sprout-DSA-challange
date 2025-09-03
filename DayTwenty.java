    import java.util.*;

class DayTwenty {
    public void sort(Stack<Integer> stack) {

        
        if (!stack.isEmpty()) {


            int top = stack.pop();
            sort(stack);


            insert(stack, top);


        }
    }

    private void insert(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {


            stack.push(value);
        } 
        
        else
         {
            
            int top = stack.pop();
            insert(stack, value);

            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(3);
        stack1.push(1);
        stack1.push(4);
        stack1.push(2);

        DayTwenty res = new DayTwenty();


        res.sort(stack1);

        System.out.println(stack1);
    }
}

    

