package Trees;
import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {
    public static void main(String[] args){

    }

    public static void RecursiveInorder(Node root){
        if(root != null){
             RecursiveInorder(root.left);
             System.out.println(root.data);
             RecursiveInorder(root.right);
        }
    }

    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while(curr != null || !s.isEmpty()){
            while(curr!= null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            al.add(curr.data);
            curr = curr.right;
        }
        return al;
    }

    ArrayList<Integer> inOrderLeet(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while(curr != null || !s.isEmpty()){
            while(curr!= null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            al.add(curr.data);
            curr = curr.right;
        }
        return al;
    }
}
