import java.util.*;

class DayNinteen {
    public int evalPostfix(String expression) {
        Stack<Integer> stack = new Stack<>();


        for (String token : expression.split(" ")) {


            if ("+-*/".contains(token)) {
                int b = stack.pop();


                int a = stack.pop();
                switch (token) {

                    case "+": stack.push(a + b); break;

                    case "-": stack.push(a - b); break;

                    case "/": stack.push(a / b); break;
                    case "*": stack.push(a * b); break;
                    
                }


            } 
            
            else {
               
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        DayNinteen res = new DayNinteen();


        System.out.println(res.evalPostfix("2 1 + 3 *"));
        
    }


}
