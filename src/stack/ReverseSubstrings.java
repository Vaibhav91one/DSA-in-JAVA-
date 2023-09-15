package stack;

import java.util.Stack;

public class ReverseSubstrings {
    public static void main(String[] args){
        String s = "(u(love)i)";
        System.out.println(reverseParentheses(s));
    }

    public static String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);

            //if we encounter a closing paranthesis we get all the character until top of the stack in the opening paranthesis
            if(c == ')'){
                StringBuilder str = new StringBuilder("");
                while(st.peek() != '('){
                      str.append(st.pop());
                }
                //extra pop for removing the opening paranthesis
                st.pop();

                // now we will be having reversed string for the inner most string
                // and we will put it back in the stack one character at a time.
                int j = 0;
                while(j < str.length()){
                    st.push(str.charAt(j++));
                }
            }
            // if not a closing paranthesis.
            else{
                st.push(c);
            }
        }

//        The result we will be getting is opposite of what we want, so we have to reverse it.
        StringBuilder result = new StringBuilder("");
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }

//    public static String reverse(String s){
//        StringBuilder str = new StringBuilder("");
//        Stack<Character> st = new Stack<>();
//        for(int i = 0; i < s.length(); i++){
//            st.push(s.charAt(i));
//        }
//
//        while(!st.isEmpty()){
//            str.append(st.pop());
//        }
//        return str.toString();
//    }
}
