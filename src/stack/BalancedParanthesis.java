package stack;

import java.util.Objects;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args){
        String s = "[({[([{}])]})}";
        ispar(s);
    }

    static boolean ispar(String s)
    {
        Stack<Character> stack = new Stack<>();
        //pushing every first bracket
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                System.out.print(s.charAt(i));
                stack.push(s.charAt(i));
            }

            //checking if the opposite bracket exist or not
            else{
                if(stack.isEmpty()){
                    return false;
                }
                //if balanced paranthesis exists it should be on the top
                char top = stack.peek();
                if ((s.charAt(i) == ')' && top == '(') || (s.charAt(i) == ']' && top == '[') || (s.charAt(i) == '}' && top == '{')) {
                    // If it is, pop the opening bracket from the stack
                    stack.pop();
                }
                // else paranthesis are not balanced
                else{
                    System.out.println("Not equal");
                   return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
