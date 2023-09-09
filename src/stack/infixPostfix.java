package stack;

import java.util.Stack;

public class infixPostfix {
    public static void main(String[] args){
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(str));
    }

    public static int precedence(char x){
        switch (x){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return-1;
        }
    }
    public static String infixToPostfix(String exp) {
        Stack<Character> s = new Stack<>();
        StringBuilder result = new StringBuilder("");

        for(int i = 0; i < exp.length(); i++){
            char c = exp.charAt(i);

            //adding operands
            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }

            //if starting paranthesis we push
            else if(c == '('){
                s.push(c);
            }

            // we keep poping and appending every operator until we find the ending paranthesis
            else if(c == ')'){
                while(!s.isEmpty() && s.peek() != '('){
                    result.append(s.peek());
                    s.pop();
                }
                //extra pop for poping the paranthesis
                s.pop();
            }

            //if the character is an operator
            else{
                while(!s.isEmpty() && precedence(c) <= precedence(s.peek())){
                    result.append(s.peek());
                    s.pop();
                }
                s.push(c);
            }
        }
        while(!s.isEmpty()){
            if(s.peek() == '('){
                return "Invalid expression";
            }
            result.append(s.peek());
            s.pop();
        }
        return result.toString();
    }
}
